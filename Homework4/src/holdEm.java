import java.util.Scanner;


public class holdEm {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		/*Initial variables*/
		double balance = 10.50;
		double playCost = 0.25;
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

		/*Play*/
		if( selection == 1){
			play(balance, playCost);
		}

	}

	public static void play( double balance, double playCost){
		
		int playing = 1;
		
		if(playing==1){
			
		balance = balance - playCost;

		System.out.println("");
		System.out.println("Your new balance is: " + balance + ".");
		System.out.println("");
		System.out.println("You roll...");
		System.out.println("");
		
		/*Generate Numbers*/
		double number1 = (int) (Math.random() * 10);
		double number2 = (int) (Math.random() * 10);
		double number3 = (int) (Math.random() * 10);
		double number4 = (int) (Math.random() * 10);
		double number5 = (int) (Math.random() * 10);

		/*System.out.println("  1 " +   "   2    "+  "3    " + "4   " + " 5");*/
		System.out.println(number1 + " - " + number2 + " - " + number3 + " - " + number4 + " - " + number5);

		/* Two of a kind */
		if(number1 == number2 || number1 == number3 || number1 == number4 || number1 == number5 || number2 == number3 || number2 == number4 || number2 == number5 || number3 == number4 || number3 == number5 || number4 == number5){
			System.out.println("You got two of a kind! You win 25 cents!");
			balance = balance + .25;
		}
	}
		
	}
}
