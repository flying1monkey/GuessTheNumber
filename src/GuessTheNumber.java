import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables and instantiations
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int secretNumber = r.nextInt(10);
		int userGuess=0;
		String userChoice="";

		//
		

		while(!userChoice.equalsIgnoreCase("n"))
		{
			System.out.println("I've got a number between 1 and 10.  What is it?");
			System.out.println("Your guess:");
			try{
				userGuess=scan.nextInt();
				
				if(userGuess<secretNumber)
				{
					System.out.println("You guessed too low.  Try again? (Y/N)");
					userChoice=scan.next();
				}
				else if(userGuess>secretNumber)
				{
					System.out.println("You guessed too high.  Try again? (Y/N)");
					userChoice=scan.next();
				}
				else
				{
					System.out.println("You got it!");
					userChoice="n";
				}
				if(!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"))
				{
					System.out.println("Really?  You couldn't choose Y or N? Fine.  You're done.");
					userChoice="n";
				}
			}
			catch(java.util.InputMismatchException e)
	        {
				System.out.println("That's supposed to be an integer... Try again.");
	            scan.nextLine();
	        }
			
	        
		}

		System.out.println("Thanks for playing! Bye!");

	}

}
