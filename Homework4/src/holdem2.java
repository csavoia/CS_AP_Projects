import java.util.Scanner;


public class holdem2 {
	
	//Global Variables
	static double startingBalance = 10.50;
	static double balance = 10.50;
	static double playCost = 0.25;
	static Scanner in = new Scanner(System.in); 


	public static void main(String[] args) {

		/*Initial variables*/
		int selection;

		/*Print title*/
		System.out.println("");
		System.out.println("|''||''|                                   '||'  '||'         '||       '||  '                    ");
		System.out.println("   ||      ....  ... ...  ....    ....      ||    ||    ...    ||     .. ||      ....  .. .. ..   ");
		System.out.println("   ||    .|...||  '|..'  '' .||  ||. '      ||''''||  .|  '|.  ||   .'  '||    .|...||  || || ||  ");
		System.out.println("   ||    ||        .|.   .|' ||  . '|..     ||    ||  ||   ||  ||   |.   ||    ||       || || ||  ");
		System.out.println("  .||.    '|...' .|  ||. '|..'|' |'..|'    .||.  .||.  '|..|' .||.  '|..'||.    '|...' .|| || ||. ");
		System.out.println("");
		System.out.println("Please select an option. You currently have $" + balance + ".");
		System.out.println("");
		System.out.println("1 ~ Play");
		System.out.println("2 ~ Exit");

		selection = in.nextInt();
		
		if( selection == 1){
			play();
		}
		if( selection == 2){
			quit();
		}

	}

	public static void play(){
		
		balance = balance - playCost;	
		
		System.out.println("");
		System.out.println("You have chosen to play. You now have " + balance + " dollars.");
		
		roll();
	}
	
	public static void roll(){
		
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);
		int number4 = (int) (Math.random() * 10);
		int number5 = (int) (Math.random() * 10);

		System.out.println("");
		System.out.println("You roll...");
		System.out.println("");
		System.out.println(number1 + " - " + number2 + " - " + number3 + " - " + number4 + " - " + number5);
		
		System.out.println("Do you want to re-roll the first number? 1- Yes 2- No");
		int holdSelection1 = in.nextInt();		
		
		if(holdSelection1 == 1){
			number1 = (int) (Math.random() * 10);
		}
		if(holdSelection1 == 2){	
		}
		
		System.out.println("Do you want to re-roll the second number? 1- Yes 2- No");
		int holdSelection2 = in.nextInt();

		if(holdSelection2 == 1){
			number2 = (int) (Math.random() * 10);
		}
		if(holdSelection2 == 2){	
		}
		
		System.out.println("Do you want to re-roll the third number? 1- Yes 2- No");
		int holdSelection3 = in.nextInt();

		if(holdSelection3 == 1){
			number3 = (int) (Math.random() * 10);
		}
		if(holdSelection3 == 2){	
		}
		
		System.out.println("Do you want to re-roll the fourth number? 1- Yes 2- No");
		int holdSelection4 = in.nextInt();

		if(holdSelection4 == 1){
			number4 = (int) (Math.random() * 10);
		}
		if(holdSelection4 == 2){	
		}
		
		System.out.println("Do you want to re-roll the fifth number? 1- Yes 2- No");
		int holdSelection5 = in.nextInt();

		if(holdSelection5 == 1){
			number5 = (int) (Math.random() * 10);
		}
		if(holdSelection5 == 2){	
		}
		
		System.out.println("Your new numbers are: " + number1 + " - " + number2 + " - " + number3 + " - " + number4 + " - " + number5);

		/* Two of a kind */
		if(number1 == number2 || number1 == number3 || number1 == number4 || number1 == number5 || number2 == number3 || number2 == number4 || number2 == number5 || number3 == number4 || number3 == number5 || number4 == number5){

			System.out.println("You got two of a kind! You win 25 cents!");

			balance = balance + .25;
			System.out.println("");
			System.out.println("You now have " + balance + " dollars");
			replay();
		}
		
		/* Three of a kind */
		if( number1 == number2 && number1 == number5 || number1 == number2 && number1 == number5 || number2 == number3 && number2 == number4 || number2 == number3 && number2 == number5 || number4 == number1 && number4 == number5 || number4 == number3 && number4 == number2 || number4 == number2 && number4 == number5 || number4 == number5 && number4 == number2 || number5 == number2 && number5 == number3 || number3 == number4 && number3 == number5 || number3 == number1 && number3 == number2 || number3 == number2 && number3 == number4 || number1 == number4 && number1 == number5 || number1 == number2 && number1 == number3 || number1 == number2 && number1 == number4 || number1 == number2 && number1 == number5 || number1 == number3 && number1 == number4 || number1 == number3 && number1 == number4 || number1 == number3 && number1 == number5 || number1 == number4 && number1 == number5 || number2 == number3 && number2 == number4 || number2 == number3 && number2 == number4 || number2 == number3 && number2 == number4 || number2 == number4 && number2 == number5 || number3 == number1 && number3 == number2 || number3 == number2 && number3 == number4 || number3 == number4 && number3 == number5 || number4 == number1 && number4 == number2 || number4 == number2 && number4 == number3 || number4 == number5 && number4 == number1 || number2 == number1 && number2 == number3 || number2 == number3 && number2 == number4 || number2 == number4 && number2 == number5){
			System.out.println("You got three of a kind! You win 50 cents!");
			balance = balance + .50;
			System.out.println("");
			System.out.println("You now have " + balance + " dollars");
			replay();
		}
		
		/* Four of a kind */
		if(number1 == number2 && number1 == number3 && number1 == number4 || number1 == number3 && number1 == number4 && number1 == number5 || number1 == number2 && number1 == number4 && number1 == number5 || number2 == number1 && number2 == number3 && number2 == number4 || number2 == number3 && number2 == number4 && number2 == number5 || number2 == number1 && number2 == number4 && number2 == number5 || number3 == number1 && number3 == number2 && number3 == number4 || number3 == number2 && number3 == number4 && number3 == number5){
			System.out.println("You got four of a kind! You win 10 dollars!");
			balance = balance + 10;
			System.out.println("");
			System.out.println("You now have " + balance + " dollars");
			replay();
		}
		
		/* Five of a kind*/
		if(number1 == number2 && number1 == number3 && number1 == number4 && number1 == number5){
			System.out.println("You got a straight! You win 50 dollars!");
			balance = balance + 50.0;
			System.out.println("");
			System.out.println("You now have " + balance + " dollars");
			replay();
		}
		else{
			balance = balance - .25;
			
			System.out.println("You didn't get any matches, you lose 25 cents");
			System.out.println(balance);
			
			replay();
		}
		
	}
	
	public static void replay(){
		System.out.println("");
		System.out.println("1 ~ Play");
		System.out.println("2 ~ Exit");
		
		int selection = in.nextInt();
		
		if( selection == 1){
			play();
		}
		
		if( selection == 2){
			quit();
			/*if( balance > startingBalance){
			System.out.println("You have won " + (startingBalance - balance) + " dollars. Congratulations!");
			}
			if(balance < startingBalance){
			System.out.println("You have lost " + (startingBalance - balance) + " dollars. Apologies.");
			}
			*/
		}
	
	}
	public static void quit(){
		System.out.println("\nGoodbye.");
	}
}