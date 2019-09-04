import java.util.Scanner;
import java.util.Random;

class Rule{
	public String name;
	public final static int INITIAL_LIFE = 5;
	public int life;
	
	public static void greet() {
		System.out.println("Welcome to the game!");
	}
	
	public static void rules() {
		System.out.println("Input a number between 1 to 20.");
		System.out.println("You have 5 guesses!");
	}
	
	public static void makeGuess() {
		System.out.println("Please enter your answer:");
	}
	
	public static void bigger() {
		System.out.println("This number is bigger than the right answer.");
	}
	
	public static void smaller() {
		System.out.println("This number is smaller than the right answer.");
	}
	
	public static void win() {
		System.out.println("Congradulations! You win! :)");
	}
	
	public static void lose() {
		System.out.println("Too bad. You lose. :(");
	}
	
	public static void playAgain() {
		System.out.println("Do you want to play again? Enter 9 to play, other numbers to quit.\n\n");
	}
	
	public void showLife() {
		System.out.println("You have " + life +" lives left.");
	}
	
}


public class Game1 {

	public static void main(String[] args) {
		int playing = 9;
		
		Rule game = new Rule();
	
		
		do {
			
			//initializing game
			game.life = Rule.INITIAL_LIFE;
			int yourAnswer = 22;
			int correctAnswer = 0;
			
				//game intro
				Rule.greet();
				Rule.rules();
				
				//generating right answer
				Random rand = new Random();
				correctAnswer = rand.nextInt(20)+1;
				
				//start playing
				while(yourAnswer!=correctAnswer && game.life >0) {
				  //player make guess
				  Rule.makeGuess();
				  Scanner input = new Scanner(System.in);
				  yourAnswer = input.nextInt();
				
				  //giving hint
					  if (yourAnswer>correctAnswer) {
						  Rule.bigger();
						  game.life--;
						  game.showLife();
					  }
					  else if(yourAnswer<correctAnswer)  {
						  Rule.smaller();
						  game.life--;
						  game.showLife();
					  }
				};
				
			//judging	
			if (game.life == 0){
				Rule.lose();
				System.out.println("The correct answer is: "+correctAnswer);
				Rule.playAgain();
				Scanner input1= new Scanner(System.in);
				playing = input1.nextInt();
				
			}
			
			else {
				Rule.win();
				System.out.println("This is the correct answer!");
				Rule.playAgain();
				Scanner input2= new Scanner(System.in);
				playing = input2.nextInt();
				
			};
			
			//decide if play again
			
		}while(playing==9);
	
	}
	
}
