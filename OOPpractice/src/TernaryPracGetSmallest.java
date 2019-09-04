import java.util.Scanner;

public class TernaryPracGetSmallest {

	public static void main(String[] args) {
		final int SIZE = 5;
		
		int count = 0;
		int smallest = 1000000;
		int input;
		
		Scanner in = new Scanner(System.in);
		
		while(count<SIZE) {
			System.out.println("Enter integer #"+ (count+1));
			input = in.nextInt();
			smallest = input<smallest?input:smallest;
			count++;
		}
		
		System.out.println("Smallest number is "+smallest);
		
	}

}
