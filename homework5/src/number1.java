import java.io.*;
import java.util.Scanner;

public class number1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in); 
		
		System.out.println("\nWelcome to Carlosoft Arrays 2012. Please choose an option\n");
		
		//Create variable for navigation/going back to menu
		int selection = 0;
		
		while(selection == 0){
		System.out.println("\n1- Count forward and back\n2- User input for values\n3- Custom array size\n4- Random number array\n5- Random number array with number searching\n6- Exit\n ");
		{
			selection = in.nextInt();
			
			if(selection == 1){
				option1();
				selection = 0;
			}
			
			if(selection == 2){
				option2();
				selection = 0;
			}
			
			if(selection == 3){
				option3();
				selection = 0;
			}
			
			if(selection == 4){
				option4();
				selection = 0;
			}
			if(selection == 5){
				option5();
				selection = 0;
			}
			if(selection == 6){
				System.out.println("Are you sure you want to quit? 1- Yes 0- No");
				
				int choice = in.nextInt();
				
				//Options to quit, computer gets an attitude
				if( choice == 1){
					System.out.println("\nExiting Carlosoft Arrays 2012, goodbye.");
				}
				if( choice == 0){
					selection = 0;
				}
			}
			if(selection > 6){
				System.out.println("\nYou have chosen an invalid option. Please choose a valid option.\n");
				selection = 0;
			}
			if(selection < 0){
				System.out.println("\nYou have chosen an invalid option. Please choose a valid option.\n");
				selection = 0;
			}
			
		}
	
	}
		
}
	//Option 1
	public static void option1(){
		System.out.println("\nOption 1 chosen. Counting forward and back.\n");
		
		int[] a = new int[10];
		
		//Define table cell values
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
		
		for(int i=0; i < a.length; i= i+1)
		{
			System.out.println(a[i] + "\n");
		}
		
		for(int i=9; i >= 0; i= i-1)
		{
			System.out.println(a[i] + "\n");
		}
	}
	
	public static void option2(){
		Scanner in = new Scanner(System.in); 

		System.out.println("\nOption 2 chosen.");
		
		int[] a = new int[10];
		
		//Asks for and accepts users values for cells
		for(int i=0; i < a.length; i= i+1)
		{
			System.out.println("\nPlease input a value for cell " + (i + 1));
			a[i] = in.nextInt();
		}
		
		System.out.println("\nThe values you have selected are...\n" );
		
		//Print array
		for(int i=0; i < a.length; i= i+1)
		{
			System.out.println( "Cell " + (i+1) + ": " + a[i] + "\n");
		}
	}
	
	public static void option3(){
		Scanner in = new Scanner(System.in); 

		System.out.println("\nOption 3 chosen. Please pick how many cells you would like to have.");
		
		//Create variable for how long array will be, asks for input
		int arrayLength = in.nextInt();
		
		int[] a = new int[arrayLength];
		
		//Confirm cell length
		System.out.println("\nYou have chosen to make " + arrayLength + " arrays.");
		
		//Asks for and accepts users values for cells
		for(int i=0; i < a.length; i= i+1)
		{
			System.out.println("\nPlease input a value for cell " + (i + 1));
			a[i] = in.nextInt();
		}
		
		System.out.println("\nThe numbers in your array are...\n");
		
		//Print array
		for(int i=0; i < a.length; i= i+1)
		{
			System.out.println( "Cell " + (i+1) + ": " + a[i] + "\n");
		}
	}
	
	public static void option4(){
		
		//Description of function
		System.out.println("Option 4 chosen.\nCreating random cell numbers.");
		
		//Create array
		int[] a = new int[10];

		//Assign random number to all values of array, print numbers
		for(int i = 0; i < a.length; i = i + 1){
			a[i] = (int) (Math.random() * 100 );
			System.out.println( "\nCell " + (i+1) + ": " + a[i] + "\n");
		}
	}
	
	public static void option5(){
		Scanner in = new Scanner(System.in); 
		
		//Description of function
		System.out.println("\nOption 5 chosen.");
		
		//Create cell variable
		int[] a = new int[10];
		
		//Generate cell numbers
		for(int i = 0; i < a.length; i = i + 1 ){
			a[i] = (int) (Math.random() * 10);
		}
		
		for(int i = 0; i < a.length; i = i + 1){
			a[i] = (int) (Math.random() * 100 );
			System.out.println( "\nCell " + (i+1) + ": " + a[i] + "\n");
		}
		
		int running = 1;
		
		while(running == 1){
			
		running = 2;
			
		System.out.println("\nPlease search for a number. If that number does not exist, you may re-try or exit.");
		
		//Asks for user to search to input search number, assign number to variable
		System.out.println("What value would you like to search for?");
		
		int searchNumber = in.nextInt();
		
		//Create flag
		boolean flag = false;
		
		for(int i=0; i < a.length; i= i+1)
		{
			//If array at i is equal to number
			if( a[i] == searchNumber )
			{
				//Set flag to true if found
				flag = true;
			}
		}
		
		//Flag conditionals
		if(flag == true){
			System.out.println("\nThe number you searched for exists! Huge success!\n");
		}
		else{
			System.out.println("\nSorry, that number does not exist in the array. Would you like to try again? 1 - Yes 0 - No");
			
			int selection = in.nextInt();
			
			//Yes
			if(selection == 1){
				running = 1;
			}
			
			//no
			if(selection == 0){
			}
			
		}
		
		
	}

	}
}