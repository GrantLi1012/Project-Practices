import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int grade;
	private String studentID;
	private String courses = " ";
	private static final int COSTPERCOURSE = 600;
	private int balance = 1800;
	private int tuition;
	private static int id = 1000;
	private int courseNum = 0;

	// Constructor: name and year for each student
	public Student() {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter student first name: ");
		this.firstName = input.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = input.nextLine();

		System.out.println("1 Freshmen\n2 Sophmore\n3 Junior\n4 Senior\nEnter grade code: ");
		this.grade = input.nextInt();

		setID();

		System.out.println("Student: " + firstName + " " + lastName + " " + grade + " " + studentID);


	}

	// 5-digit ID, first number being grade
	private void setID() {
		id++;
		this.studentID = grade + "" + id;
	}

	// enroll for courses(history101,mathmatics101,english101,chemistry101,computer
	// science101)
	public void enroll() {
		courseNum = 0;
		do {
			System.out.println("Enter enrolled courses(Q = quit):");
			Scanner input2 = new Scanner(System.in);
			String course = input2.nextLine();

			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				courseNum++;
			} else {
				System.out.println("Break!");
				break;
			}
		} while (1 != 0);

		System.out.println("You enrolled in:" + courses);
		System.out.println("Student balance: " + balance);
	}

	// each course costs $600
	// student can view balance and pay tuition
	public void payTuition() {
		int totalTuition = courseNum * COSTPERCOURSE;

		System.out.println("Total tuition: " + totalTuition);

		if (balance < totalTuition) {
			System.out.println("Insufficient balance!");
		}

		else {
			System.out.println("Pay tuition? Y/N");
			Scanner input3 = new Scanner(System.in);
			String answer = input3.nextLine();
			
			switch (answer) {
			case ("Y"):
				this.balance -=totalTuition;
				System.out.println("Payment successful!");
				System.out.println("Current balance: "+this.balance);
				break;
			case ("N"):
				System.out.println("Payment ended.");
				System.out.println("Current balance: "+this.balance);
				courses = " ";
				break;
			default:
				System.out.println("Can't recognize.");
				break;
			}
		}
	}
	// status of student:name,ID,course enrollment,balance
	
	public void showInfo() {
		System.out.println("Student: "+firstName+" "+lastName);
		System.out.println("ID: "+ this.studentID);
		System.out.println("Courses enrolled: "+courses);
		System.out.println("Total balance: "+ balance);
	}
	
}
