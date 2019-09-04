import java.util.Scanner;

public class Database_app {

	public static void main(String[] args) {

		//ask for new student number
		
		System.out.println("Enter number of new students: ");
		Scanner in = new Scanner(System.in);
		int studentNum = in.nextInt();
		
		//create a number of new students
		Student[] students = new Student[studentNum];
		
		for (int i=0;i<studentNum;i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		students[1].showInfo();
	}

}
