import java.util.Scanner;

public class QuartsToGallons
{
	public static void main(String[] args) 
	{
	//constants
		final int QUARTS_IN_GALLON = 4;

	//variables
		int quartsNeeded;
		int gallonsNeeded;
		int extraQuarts;

	//ask the user how much paint is required for the job
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter quarts needed for job --> ");
		quartsNeeded = keyboard.nextInt();

		gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;

		extraQuarts = quartsNeeded % QUARTS_IN_GALLON;

	//figure out how much paint is needed for the job
		System.out.println("A job that needs " + quartsNeeded + 
		" quart(s) will require us to buy " + gallonsNeeded + 
		" gallon(s) and " + extraQuarts + " extraQuart(s).");
	}
}