import java.util.Scanner;

public class number1{
		public static void main(String[] args){
			
			
			Scanner in = new Scanner(System.in);
			
			int x = 0;
			
			while(x == 0){
				
				System.out.println("1- While Loop | 2 - Do while loop | 3 - For loop | 4 - Count from 2 to 100 | 5 - Count from 100 to 2 | 6 - Count from 1 to user input | 7 - Exit");

				x = in.nextInt();
				
				/* While loop */
				if( x == 1 ){
					option1();
					x = 0;
				}
				
				/* Do while loop */
				if( x == 2){
					option2();
					x = 0;
				}
				
				/* For loop */
				if( x == 3){
					option3();
					x = 0;
				}
				
				/* Count from 2 to 100 by 2 */
				if( x == 4){
					option4();
					x = 0;
				}
				
				/* Count from 100 to 2 by 2 */
				if( x == 5){
					option5();
					x = 0;
				}
				
				/* Count from 1 to user input */
				if( x == 6){
					option6();
					x = 0;
				}
				
				/* Exit application */
				if( x == 7){
					System.out.println("You have chosen to exit. Goodbye.");
				}
			}
		
			}
		
		/* While loop function */
		public static void option1(){
			int randomNumber = (int) (Math.random() * 100 );
			System.out.println("Counting to: " + randomNumber);
			
			int startNumber = 1;

			while( startNumber < randomNumber){
				startNumber = startNumber + 1;
				
				/* print number */
				System.out.println( startNumber );
			}
		}
			
		/* Do while loop function */
		public static void option2(){
			int randomNumber = (int) (Math.random() * 100 );
			System.out.println("Counting to: " + randomNumber);
			
			int startNumber = 1;
			System.out.println(startNumber);
			
			do{
				startNumber = startNumber + 1;
				System.out.println(startNumber);
			}while(startNumber < randomNumber);
		}
		
		/* For loop function */
		public static void option3(){
			int randomNumber = (int) (Math.random() * 100);
			System.out.println("Counting to: " + randomNumber);
			
			int startingNumber = 1;
			
			for( startingNumber = 1; startingNumber <= randomNumber; startingNumber = startingNumber + 1 ){
				System.out.println(startingNumber);
			}
		}
		
		/* Count from 2 to 100 */
		public static void option4(){
			for(	int i=2;		i <= 100;		i=i+2 )
			{
				//print i
			   	System.out.println(i);
			}
		}
		
		/* Count from 100 to 2 */
		public static void option5() {
			for(	int i=100;		i > 1;		i=i-2 )
			{
				//print i
			   	System.out.println(i);
			}
		}
		
		/* Count from 1 to user input */
		public static void option6(){
			Scanner in = new Scanner(System.in);
						
			/* User input */
			int chosenNumber = in.nextInt();
			
			int i = 0;
			
			for( i = 1; i <= chosenNumber; i = i + 1){
				System.out.println(i);
			}
			
		}
}
