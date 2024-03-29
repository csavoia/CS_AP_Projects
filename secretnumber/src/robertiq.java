import java.io.*;
import java.util.*;

public class robertiq
{
	public static void main(String[] args)
	{
		
		//init library object
		//create variable for input/output
		Scanner in = new Scanner(System.in);
		
		System.out.println("Guess Robert's IQ!");
		
		int secretnumber = (int)(10.0 * Math.random());

		int x = 1;
		int tries = 1;
		
		while (x != secretnumber){
			
		x = in.nextInt();
		
		if( x < secretnumber )
		{
			System.out.println("Go higher...");
			tries = tries + 1;
		}
		else if( x > secretnumber )
		{
			System.out.println("Go lower...");
			tries = tries + 1;
		}
		else
		{
			System.out.println("Correct, the number was " + secretnumber + "! You got it in " + tries + " tries!");
		}
		}

	}
}