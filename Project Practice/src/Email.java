import java.util.Scanner;
import java.util.Random;

public class Email {
	
	//encapsulate the objects
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "aeycompany.com";
	
	//constructor to receive name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("User:"+this.firstName+" "+this.lastName);
		
		//call method asking for department
		//return department name
		this.department = setDepartment();
		
		//call a method that returns a random password
		this.password = setPassword(defaultPasswordLength);
		
		//combine elements to create email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		
	}
	
	
	
	
	//ask for department
	private String setDepartment(){
		System.out.print("Enter department code.\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		switch(depChoice) {
		case 1: return "sale";
		case 2: return "dev";
		case 3: return "acct";
		default: return "";
		}
	}
	
	//generate random password
	private String setPassword(int length) {
		String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random()*(passwordCharacters.length()));
			password[i]= passwordCharacters.charAt(rand);
		}
		System.out.println("Initial password:" + new String(password));
		return new String(password);
	}
	
	
	//----setters
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//set alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	//change password
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}


	//----getters

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public String showInfo() {
		return "DISPLAY NAME: "+ firstName+" "+lastName + "\n"
	    +"CONPANY EMAIL: "+ email+ "\n"+
	    "MAILBOX CAPACITY: " + mailboxCapacity +" MB\n";
	}
	
}
