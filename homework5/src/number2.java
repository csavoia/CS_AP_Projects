import java.util.Scanner;
import java.io.*;

public class number2 {


	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {	

		int input = 0;
		int triesleft = 0;

		//init arrays
		int[] pin = new int[5];
		double[] balance = new double[5];

		//set balances
		balance[0] = 100.5;
		balance[1] = 100.5;
		balance[2] = 100.5;
		balance[3] = 100.5;
		balance[4] = 100.5;

		//set pins
		pin[0] = 3736; //emil
		pin[1] = 2945; //bertha
		pin[2] = 9728; //hans
		pin[3] = 8273; //deirdre
		pin[4] = 1826; //augusten


		int i = 0;
		int tries = 0;

		int user;
		int bank = 1;

		while (bank == 1){
			//ask to enter PIN
			System.out.println("Welcome to the ATM. Please enter your PIN Number.\n");

			tries = 0;

			while (tries < 4){

				//take PIN
				input = in.nextInt();

				//searching for PIN + flag makes it stop when it finds the user number
				int flag = 0;

				for (i=0; i < pin.length && flag != 1; i = i+1){

					if (pin[i] == input){

						flag = 1;

					}

				}
				//PIN correct
				if (flag == 1){


					int bank2 = 1;

					i = i - 1;
					
					while (bank2 == 1){
				
						//figure out name
						if (i == 0){

							System.out.println("\nWelcome Emil!");

						}
						if (i == 1){

							System.out.println("\nWelcome Bertha!");

						}
						if (i == 2){

							System.out.println("\nWelcome Hans!");

						}
						if (i == 3){

							System.out.println("\nWelcome Deirdre!");

						}
						if (i == 4){

							System.out.println("\nWelcome Augusten!");

						}




						int input2 = 0;
						double money = 0;

						

						//menu
						System.out.println("\nWhat would you like to do today?\n1 - Check Balance\n2 - Deposit money\n3 - Withdraw money\n4 - Exit");

						input2 = in.nextInt();

						if (input2 == 1){

							//display balance
							System.out.println("You currently have $" + balance[i] + " in your account.");
						}
						//deposit
						if (input2 == 2){

							System.out.println("How much would you like to deposit?");

							money = in.nextDouble();

							//add money
							balance[i] = balance[i] + money;

							System.out.println("You now have $" + balance[i] + ".");
						}
						//withdraw
						if (input2 == 3){

							System.out.println("How much would you like to withdraw?");

							money = in.nextDouble();

							//subtract money
							balance[i] = balance[i] - money;

							System.out.println("You now have $" + balance[i] + ".");
						}
						//exit
						if (input2 == 4){

							bank = 1;
							bank2 = 0;
							flag = 0;
							tries = 4;
						}
					}

				}

				//PIN incorrect
				else if (tries < 4){

					//add one to tries
					tries = tries + 1;
					triesleft = 3 - tries;

					if (triesleft == 0){

						System.out.println("\nYou are now locked out.");
						break;
					}

					System.out.println("\nThat is not a PIN in the directory. Please try again. You have " + triesleft + " more attempt(s).\n");
				}

			}

		}
	} //do not touch

}//do not touch