import java.io.*;
import java.util.Scanner;

public class number3 {

	//initialize variables throughout function
	static double money = 20.00;
	static int number1;
	static int number2;
	static int number3;

	public static void main(String[] args) {

		int slot = 1;
		int play = 1;

		Scanner in = new Scanner(System.in); 

		//show ascii title "Fancy Slots"
		displayTitle();

		while (slot == 1){

			//ask player to insert coin by pressing 1 or leave by pressing 2
			//tell player current amount of money
			insertCoinPrompt();

			play = in.nextInt();

			//insert coin
			if (play == 1){
				//take away quarter
				money = money - 0.25;

				//display number on slot machine
				//display earnings, if there are any
				rollNumber();

			}
			//exit
			else{

				//display exit
				displayExit();

				break;
			}

		}

	}
	public static void displayTitle()
	{

		System.out.println("   ________)                    __              ");
		System.out.println("  (, /                      (__/  ) /)          ");
		System.out.println("    /___, _  __   _           /    // ____/_ _  ");
		System.out.println(" ) /     (_(_/ (_(__(_/_   ) /    (/_(_) (__/_)_");
		System.out.println("(_/                .-/    (_/                   ");
		System.out.println("                  (_/                           ");
		System.out.println("                                                ");
		System.out.println("         WARNING: GAMBLING IS ADDICTIVE.        ");
		System.out.println("    Call (800) 287-8670 for help recovering.    ");
		System.out.println("");
		System.out.println("");
	}
	public static void insertCoinPrompt()
	{
		System.out.println("");
		System.out.println("You have $" + money + " in your pocket.");
		System.out.println("");
		System.out.println("Would you like to play a game?");
		System.out.println("Enter 1 to insert a quarter into the machine.");
		System.out.println("Enter 2 to leave.");
	}
	public static void displayExit()
	{
		System.out.println("Goodbye and thank you for your money.");
	}
	public static void rollNumber()
	{
		number1 = (int) (Math.random() * 10);
		number2 = (int) (Math.random() * 10);
		number3 = (int) (Math.random() * 10);

		System.out.println("Your roll is: " + number1 + number2 + number3);

		//all numbers equal 7
		if (number1 == 7 && number2 == 7 && number3 == 7){

			System.out.println("Jackpot! You win ten dollars!");
			//give 10 dollars
			money = money + 10.00;

		}
		//all numbers are equal
		else if (number1 == number2 && number2 == number3 && number3 == number1){
			
			System.out.println("You win three dollars!");
			//give 3 dollars
			money = money + 3.00;
		}
		//two numbers are equal
		else if (number1 == number2 || number2 == number3 || number3 == number1){
			
			System.out.println("You win 50 cents!");
			//give 50 cents
			money = money + 0.50;
		}

		//no numbers are equal
		else {
			
			System.out.println("You win nothing.");
		}
	}

}

