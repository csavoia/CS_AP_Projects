import java.io.*;
import java.util.Scanner;

public class number1 {
	
	public static void main (String[] args) {
		
		System.out.println("Welcome to Roulette Light! What would you like to do?");
		
		//Call options function
		
		option();
		 
	}
	
	public static void option(){
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
		
		int balance = 10;
		int playing = 1;
		
		System.out.println("Please input a number. You currently have $10");

		while(playing == 1){
			balance = balance - 1;
			
			playing = 0;
					
			int numberPicked = in.nextInt();
			
			if( numberPicked%2 == 0 )
			{
				boolean even = true;
			}
			
			else
			{
				boolean odd = true;
			}
			
			int rouletteTime = (int)(10.0 * Math.random()) + 10;
			System.out.println("\nThere will be " + rouletteTime + " rolls.");
			
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
					
					if( rouletteNumber == numberPicked){
						balance = balance + 11;
						System.out.println("\nYou picked the same number! You now have $" + balance);
						
					}
				}
				
				if( i == (rouletteTime - 1)){
					if( rouletteNumber%2 == 0){
						if( numberPicked%2 == 0){
							balance = balance + 2;
							System.out.println("\nEvens! You now have $" + balance);
						}
					}
				}
				
				if( i == (rouletteTime - 1)){
					if( rouletteNumber%2 != 0){
						if( numberPicked%2 != 0){
							balance = balance + 2;
							System.out.println("\nOdds! You now have $" + balance);
						}
					}
				}
							
			}
			
			System.out.println("\nWould you like to play again? You have $" + balance + ". 1 - Play 2 - Exit");
		}
		
		int choice = in.nextInt();

		if(choice == 1){
			play();
		}else{
			System.out.println("Goodbye.");
		}
		
	}
	
	public static void exit(){
		System.out.println("\nGoodbye");
	}
	
	public static void roll(){
		
	}
}
