import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String newMovie;
		String rating;
		String confirmation;
		char oneMore;
		int tixSold;
		
		do
		{
			
			System.out.println("Enter the title of a movie");
			newMovie = keyboard.nextLine();
			
			System.out.println("What is the movie rated?");
			rating = keyboard.nextLine();
			
			System.out.println("How many tickets were sold?");
			tixSold = keyboard.nextInt();
						
			System.out.println(newMovie + " is rated " + rating + " and sold " +
			tixSold + " ticket(s).");
			
			keyboard.nextLine();
			
			System.out.println("Would you like to enter another movie?");
			System.out.println("Enter Y for yes");
			confirmation = keyboard.nextLine();
			oneMore = confirmation.charAt(0);
			
						
		} while (oneMore == 'Y' || oneMore == 'y');
		
		System.out.println("Thank you, goodbye");
		
		keyboard.close();


	}

}
