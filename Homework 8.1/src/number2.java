import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JComponent;

class number2 extends JFrame{

	//Global Variables
	static double startingBalance = 10.50;
	static double balance = 10.50;
	static double playCost = 0.25;
	static Scanner in = new Scanner(System.in); 

	public static void main(String[] arg) throws Exception
	{

		//create canvas object with name of the class
		number2 mycanvas = new number2();

		//set size of canvas setSize(x,y) by pixel
		mycanvas.setSize(600,600);

		//show canvas
		mycanvas.setVisible(true);  
	}

	public void paint(Graphics g) {

		/*Initial variables*/
		int selection;

		clearCanvas(g);
		drawTitle(g);

		System.out.println("Please select an option. You currently have $" + balance + ".");
		System.out.println("");
		System.out.println("1 ~ Play");
		System.out.println("2 ~ Exit");

		selection = in.nextInt();

		if( selection == 1){
			play(g);
		}
		if( selection == 2){
			quit();
		}

	}

	public static void play(Graphics g){

		drawTable(g);
		
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

		/* Five of a kind*/
		if(number1 == number2 && number1 == number3 && number1 == number4 && number1 == number5){
			System.out.println("You got a straight! You win 50 dollars!");
			balance = balance + 50.0;
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
		/* Three of a kind */
		if( number1 == number2 && number1 == number5 || number1 == number2 && number1 == number5 || number2 == number3 && number2 == number4 || number2 == number3 && number2 == number5 || number4 == number1 && number4 == number5 || number4 == number3 && number4 == number2 || number4 == number2 && number4 == number5 || number4 == number5 && number4 == number2 || number5 == number2 && number5 == number3 || number3 == number4 && number3 == number5 || number3 == number1 && number3 == number2 || number3 == number2 && number3 == number4 || number1 == number4 && number1 == number5 || number1 == number2 && number1 == number3 || number1 == number2 && number1 == number4 || number1 == number2 && number1 == number5 || number1 == number3 && number1 == number4 || number1 == number3 && number1 == number4 || number1 == number3 && number1 == number5 || number1 == number4 && number1 == number5 || number2 == number3 && number2 == number4 || number2 == number3 && number2 == number4 || number2 == number3 && number2 == number4 || number2 == number4 && number2 == number5 || number3 == number1 && number3 == number2 || number3 == number2 && number3 == number4 || number3 == number4 && number3 == number5 || number4 == number1 && number4 == number2 || number4 == number2 && number4 == number3 || number4 == number5 && number4 == number1 || number2 == number1 && number2 == number3 || number2 == number3 && number2 == number4 || number2 == number4 && number2 == number5){
			System.out.println("You got three of a kind! You win 50 cents!");
			balance = balance + .50;
			System.out.println("");
			System.out.println("You now have " + balance + " dollars");
			replay();
		}
		/* Two of a kind */
		if(number1 == number2 || number1 == number3 || number1 == number4 || number1 == number5 || number2 == number3 || number2 == number4 || number2 == number5 || number3 == number4 || number3 == number5 || number4 == number5){

			System.out.println("You got two of a kind! You win 25 cents!");

			balance = balance + .25;
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
			play(null);
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
	public void clearCanvas(Graphics g)
	{	
		g.setColor(Color.WHITE); //set color

		g.fillRect(0, 0, 600, 600); //draw filled rectangle
	}

	public void drawTitle(Graphics g)
	{	

		//title bg - pastelish green
		g.setColor(new Color(95, 199, 163));

		g.fillRect(0, 0, 600, 600); 
		
		g.setColor(Color.WHITE);
		
		Font font;
		
		font = new Font("SansSerif", Font.PLAIN, 40);
		
		g.drawString("Texas Hold-Em", 200, 250);
	}
	public static void drawTable(Graphics g)
	{	
		//table - brown
		g.setColor(new Color(139, 38, 38));

		g.fillRect(0, 0, 600, 600); 

		//pastelish green
		g.setColor(new Color(95, 199, 163));
		
		g.fillRect(50, 100, 500, 400);
		
		//cards
		g.setColor(Color.WHITE);
		
		g.fillRoundRect(70, 150, 60, 90, 10, 10);
		
		g.setColor(Color.RED);
		
		g.drawRoundRect(75, 155, 50, 80, 10, 10);
		
		//next card
		g.setColor(Color.WHITE);
		
		g.fillRoundRect(200, 175, 60, 90, 10, 10);
		
		g.setColor(Color.BLACK);
		
		g.drawRoundRect(205, 180, 50, 80, 10, 10);
		
		//next card
		g.setColor(Color.WHITE);
		
		g.fillRoundRect(330, 175, 60, 90, 10, 10);
		
		g.setColor(Color.BLACK);
		
		g.drawRoundRect(335, 180, 50, 80, 10, 10);
		
		//cup
		
		g.setColor(Color.LIGHT_GRAY);
		
		g.fillOval(400, 70, 100, 100);
		
		g.setColor(Color.GRAY);
		
		g.drawOval(420, 90, 60, 60);
		
	}
}