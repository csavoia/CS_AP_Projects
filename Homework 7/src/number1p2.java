import java.io.*;
import java.util.Scanner;

public class number1p2 {

	static int balance = 10;
	
	public static void main (String[] args) {

		System.out.println("Welcome to Roulette Light! What would you like to do?");

		//Call options function

		option();

	}

	public static void option(){

		//play or exit
		Scanner in = new Scanner(System.in); 

		System.out.println("\n1- Play 2 - Exit");

		int selection = in.nextInt();

		if(selection == 1){
			play();
		}
		if(selection == 2){
			exit();
		}

	}

	public static void play(){
		Scanner in = new Scanner(System.in); 

		int playing = 1;

		while(playing == 1){
			playing = 0;

			System.out.println("Would you like to choose a number, or pick evens or odds? Each roll game costs one dollar. \n1- Pick Number (Payout: $11)\n2- Evens (Payout: $2)\n3- Odds (Payout: $2)");

			int choice = in.nextInt();

			if(choice == 1){

				balance = balance - 1;

				System.out.println("Please input a number.");

				int numberPicked = in.nextInt();

				//calculate roll time
				int rouletteTime = (int)(10.0 * Math.random()) + 10;

				//roll/display numbers
				for( int i = 0; i < rouletteTime; i++){
					int rouletteNumber = (int)(Math.random()*10 + 1);

					if(rouletteNumber == 1){
						System.out.println("\n   #   \n  ##   \n # #   \n   #   \n   #   \n   #   \n####### ");
					}
					if(rouletteNumber == 2){
						System.out.println("\n #####  \n#     # \n      # \n #####  \n#       \n#       \n####### ");
					}
					if(rouletteNumber == 3){
						System.out.println("\n #####  \n#     # \n      # \n #####  \n      # \n#     # \n ##### ");
					}
					if(rouletteNumber == 4){
						System.out.println("\n#       \n#    #  \n#    #  \n#    #  \n####### \n     #  \n     #  ");
					}
					if(rouletteNumber == 5){
						System.out.println("\n######\n#       \n#       \n######  \n      # \n#     # \n #####  ");
					}
					if(rouletteNumber == 6){
						System.out.println("\n #####  \n# \n#       \n######  \n#     # \n#     # \n######  ");	
					}
					if(rouletteNumber == 7){
						System.out.println("\n####### \n#      #  \n      #   \n    #    \n  #     \n #     \n#     ");
					}
					if(rouletteNumber == 8){
						System.out.println("\n #####  \n#     # \n#     # \n #####  \n#     # \n#     # \n #####  ");
					}
					if(rouletteNumber == 9){
						System.out.println("\n #####  \n#    # \n#    # \n #####\n     # \n     # \n ##### ");
					}
					if(rouletteNumber == 10){
						System.out.println("\n   #       ##   \n  ##      #  #  \n # #     #    # \n   #     #     # \n   #     #     # \n   #      #   #  \n #####      ##   ");
					}

					try
					{
						//pause for 1000 ms = 1 second
						Thread.currentThread().sleep(1000);
					}
					catch(InterruptedException ie){}

					//check for when max number of rolls are done
					if( i == (rouletteTime - 1)){

						//check if number picked = roulette number
						if( rouletteNumber == numberPicked){
							balance = balance + 11;
							System.out.println("\nYou picked the same number! You now have $" + balance);

						}
						else{
							System.out.println("\nSorry, no matches!");
						}
					}

				}

				System.out.println("\nWould you like to play again? You have $" + balance + ". 1 - Play 2 - Exit");
				
				int playExit = in.nextInt();

				if(playExit == 1){
					play();
				}else{
					System.out.println("Goodbye.");
				}
			}
			
			if(choice == 2){

				balance = balance - 1;

				int numberPicked = 2;

				int rouletteTime = (int)(10.0 * Math.random()) + 10;

				//roll/display numbers
				for( int i = 0; i < rouletteTime; i++){
					int rouletteNumber = (int)(Math.random()*10 + 1);

					if(rouletteNumber == 1){
						System.out.println("\n   #   \n  ##   \n # #   \n   #   \n   #   \n   #   \n####### ");
					}
					if(rouletteNumber == 2){
						System.out.println("\n #####  \n#     # \n      # \n #####  \n#       \n#       \n####### ");
					}
					if(rouletteNumber == 3){
						System.out.println("\n #####  \n#     # \n      # \n #####  \n      # \n#     # \n ##### ");
					}
					if(rouletteNumber == 4){
						System.out.println("\n#       \n#    #  \n#    #  \n#    #  \n####### \n     #  \n     #  ");
					}
					if(rouletteNumber == 5){
						System.out.println("\n######\n#       \n#       \n######  \n      # \n#     # \n #####  ");
					}
					if(rouletteNumber == 6){
						System.out.println("\n #####  \n# \n#       \n######  \n#     # \n#     # \n######  ");	
					}
					if(rouletteNumber == 7){
						System.out.println("\n####### \n#      #  \n      #   \n    #    \n  #     \n #     \n#     ");
					}
					if(rouletteNumber == 8){
						System.out.println("\n #####  \n#     # \n#     # \n #####  \n#     # \n#     # \n #####  ");
					}
					if(rouletteNumber == 9){
						System.out.println("\n #####  \n#    # \n#    # \n #####\n     # \n     # \n ##### ");
					}
					if(rouletteNumber == 10){
						System.out.println("\n   #       ##   \n  ##      #  #  \n # #     #    # \n   #     #     # \n   #     #     # \n   #      #   #  \n #####      ##   ");
					}

					try
					{
						//pause for 1000 ms = 1 second
						Thread.currentThread().sleep(1000);
					}
					catch(InterruptedException ie){}

					if( i == (rouletteTime - 1)){
						
						//check if rolled number is even
						if( rouletteNumber%2 == 0){
							if( numberPicked%2 == 0){
								balance = balance + 2;
								System.out.println("\nEvens! You now have $" + balance);
							}
						}
						else{
							System.out.println("\nSorry, the number was odd!");
						}
					}
				}

				System.out.println("\nWould you like to play again? You have $" + balance + ". 1 - Play 2 - Exit");
			

				int playExit = in.nextInt();

				if(playExit == 1){
					play();
				}else{
					System.out.println("Goodbye.");
				}
			}


			if(choice == 3){

				balance = balance - 1;

				int numberPicked = 3;

				int rouletteTime = (int)(10.0 * Math.random()) + 10;

				for( int i = 0; i < rouletteTime; i++){
					int rouletteNumber = (int)(Math.random()*10 + 1);

					if(rouletteNumber == 1){
						System.out.println("\n   #   \n  ##   \n # #   \n   #   \n   #   \n   #   \n####### ");
					}
					if(rouletteNumber == 2){
						System.out.println("\n #####  \n#     # \n      # \n #####  \n#       \n#       \n####### ");
					}
					if(rouletteNumber == 3){
						System.out.println("\n #####  \n#     # \n      # \n #####  \n      # \n#     # \n ##### ");
					}
					if(rouletteNumber == 4){
						System.out.println("\n#       \n#    #  \n#    #  \n#    #  \n####### \n     #  \n     #  ");
					}
					if(rouletteNumber == 5){
						System.out.println("\n######\n#       \n#       \n######  \n      # \n#     # \n #####  ");
					}
					if(rouletteNumber == 6){
						System.out.println("\n #####  \n# \n#       \n######  \n#     # \n#     # \n######  ");	
					}
					if(rouletteNumber == 7){
						System.out.println("\n####### \n#      #  \n      #   \n    #    \n  #     \n #     \n#     ");
					}
					if(rouletteNumber == 8){
						System.out.println("\n #####  \n#     # \n#     # \n #####  \n#     # \n#     # \n #####  ");
					}
					if(rouletteNumber == 9){
						System.out.println("\n #####  \n#    # \n#    # \n #####\n     # \n     # \n ##### ");
					}
					if(rouletteNumber == 10){
						System.out.println("\n   #       ##   \n  ##      #  #  \n # #     #    # \n   #     #     # \n   #     #     # \n   #      #   #  \n #####      ##   ");
					}

					try
					{
						//pause for 1000 ms = 1 second
						Thread.currentThread().sleep(1000);
					}
					catch(InterruptedException ie){}

					if( i == (rouletteTime - 1)){
						//check if rolled number is odd
						if( rouletteNumber%2 != 0){
							if( numberPicked%2 != 0){
								balance = balance + 2;
								System.out.println("\nOdds! You now have $" + balance);
							}
						}
						else{
							System.out.println("\nSorry, the number was even!");
						}
					}

				}

				System.out.println("\nWould you like to play again? You have $" + balance + ". 1 - Play 2 - Exit");
				
				int playExit = in.nextInt();

				if(playExit == 1){
					play();
				}else{
					System.out.println("Goodbye.");
				}
			}
		}
		
		
		
		}

	public static void exit(){
		System.out.println("\nGoodbye");
	}

	public static void roll(){

	}
}