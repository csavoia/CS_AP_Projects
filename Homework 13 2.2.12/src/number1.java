import java.util.*;

class StringDemo{

	private Scanner in;
	
	public StringDemo(){
		
		in = new Scanner(System.in);
		
	}
	
	//method to compare 2 strings
	public void compare2Strings()
	{
		//Get 2 words from users
		System.out.println("Enter 2 number:");
		String firstString = in.nextLine();
		String secondString = in.nextLine();
		
		//compare the 2 strings (use java docs)
		int compareResult = firstString.compareTo(secondString);
	
		//print the result
		if( compareResult == 0 )
			System.out.println("They are equal.");
		else if( compareResult < 0 )
			System.out.println("First word precedes Second word.");	
		else if( compareResult > 0 )
			System.out.println("Second word precedes First word.");	
	}	
	
	//converts string to caps lock
	public void toCapsLock(){
		System.out.println("Enter a string to convert to capital letters");
		String toCaps = in.nextLine();
		
		//converts input to upper case
		toCaps = toCaps.toUpperCase();
		
		System.out.println(toCaps);
		
	}
	
	//converts a string to lower case
	public void toLowerCase(){
		
		System.out.println("Enter a string in all capitals to convert to lower case");
		String toLowerCase = in.nextLine();
		
		//converts to lowercase
		toLowerCase = toLowerCase.toLowerCase();
		
		System.out.println(toLowerCase);
		
	}
	
	//prints a substring from characters 2 to 4
	public void subString(){
		
		System.out.println("Enter a string up to 4 characters to see its substring.");
		String toSubString = in.nextLine();
		
		//gets letters 2, 3 and 4
		toSubString = toSubString.substring(1, 4);
		
		System.out.println(toSubString);
		
	}
	
	//append a string to the phrase "i am" (concantenation)
	public void concantenation(){
		
		System.out.println("Enter a string which you would like to append (concantenate) to the phrase 'I am'");
		String appendTo = in.nextLine();
		String iAm = "I am ";
		
		//appends appendTo variable to phrase "I am"
		iAm = iAm.concat(appendTo);
		
		System.out.println(iAm);
		
	}
	
	//replaces all occurences of "e" with "o"
	public void replaceLetters(){
		System.out.println("Enter a string with the letter 'O'. All occurences of 'O' will be replace with an 'E'");
		String replaceString = in.nextLine();
		
		replaceString = replaceString.replace('o', 'e');
		
		System.out.println(replaceString);
		
	}

}

//math demo class
class MathDemo{
	
	private Scanner in;
		
		public MathDemo(){
			
			in = new Scanner(System.in);
			
		}
		
	//return absolute value of input
	public void toAbsoluteValue(){
		
		System.out.println("Please enter a negative integer to convert to absolute value.");
		int toAbsoluteValue = in.nextInt();
		
		//convert to positive
		toAbsoluteValue = Math.abs( toAbsoluteValue);
		
		System.out.println(toAbsoluteValue);
	}
	
	//find square root of
	public void squareRoot(){
		
		System.out.println("Please enter a number to find the square root of.");
		
		double squareValue = in.nextDouble();
		
		//find square root of input
		squareValue = Math.sqrt(squareValue);
		
		System.out.println(squareValue);
		
	}
	
	//power function
	public void power(){
		
		System.out.println("Please enter a two values- the first to be the base, the second to be the power.\nEnter the base value.");
		int base = in.nextInt();
		System.out.println("Enter the power's value.");
		int power = in.nextInt();
		
		//raise base variable to power variable
		int finalNumber = (int) Math.pow( base, power);
		
		System.out.println(finalNumber);
	}
	
	//compare to find greater value
	public void compareGreaterValue(){
		
		System.out.println("Please enter two values. The greater value will be returned.");
		int valueOne = in.nextInt();
		int valueTwo = in.nextInt();
		
		//compare values
		int greaterValue = Math.max(valueOne, valueTwo);
		
		System.out.println(greaterValue);
	}
	
	//compare to find smaller value
	public void compareSmallerValue(){
		
		System.out.println("Please enter two values. The smaller value will be returned.");
		int valueOne = in.nextInt();
		int valueTwo = in.nextInt();
		
		//compare values
		int smallerValue = Math.min(valueOne, valueTwo);
		
		System.out.println(smallerValue);
	}
	
	//generate a random value
	public void randomValue(){
		
		System.out.println("This is a randomly generated value.");
		double randomNumber = (int)( 100*Math.random());
		
		System.out.println(randomNumber);
	}
	
	//round a double
	public void roundedNumber(){
		
		System.out.println("Please enter a decimal value to round to the nearest integer.");
		double numberToRound = in.nextDouble();
		
		//convert to integer/round
		numberToRound = (int)Math.floor(numberToRound);
		
		System.out.println(numberToRound);
		
	}
	
	//find sin value of input
	public void findSin(){
		
		System.out.println("Enter an angle to find its sin value.");
		double angle = in.nextDouble();
		
		//convert to radians, find sin
		angle = Math.sin(Math.toRadians(angle));
		
		System.out.println(angle);
	}
	
	//find cos value of input
	public void findCos(){
		
		System.out.println("Enter an angle to find its cos value.");
		double angle = in.nextDouble();
		
		//convert to radians, find cos
		angle = Math.cos(Math.toRadians(angle));
		
		System.out.println(angle);
	}
	
	//find tan value of input
	public void findTan(){
		
		System.out.println("Enter an angle to find its tan value.");
		double angle = in.nextDouble();
		
		//convert to radians, find tan
		angle = Math.tan(Math.toRadians(angle));
		
		System.out.println(angle);
	}
}

public class number1 {

	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		
		while(true){			
			System.out.println("1. String functions\n2. Math functions");
			int selection = in.nextInt();
			
			if(selection == 1){
		   		StringDemo stringObject = new StringDemo();
				System.out.println("1. Compare 2 strings\n2. To caps lock\n3. To lower case\n4. Substring\n5. Concantenation");

				int menuSelection = in.nextInt();

		   		//call the compare string method
				if(menuSelection==1){
					stringObject.compare2Strings();
				}
				if(menuSelection==2){
					stringObject.toCapsLock();
				}
				if(menuSelection==3){
					stringObject.toLowerCase();
				}
				if(menuSelection==4){
					stringObject.subString();
				}
		   		if(menuSelection==5){
		   			stringObject.concantenation();
		   		}

			}
			if(selection == 2){
				
				
		   		MathDemo stringObject = new MathDemo();
				System.out.println("1. Absolute value\n2. Square root\n3. Powers\n4. Compare Greater Value\n5. Compare Smaller Value\n6. Random Value\n7. Round Number\n8. Find sine\n9. Find cosine\n10. Find tangent");

				int menuSelection = in.nextInt();
				
				if(menuSelection==1){
		   			stringObject.toAbsoluteValue();
				}
				if(menuSelection==2){
		   			stringObject.squareRoot();
				}
				if(menuSelection==3){
		   			stringObject.power();
				}
				if(menuSelection==4){
					stringObject.compareGreaterValue();
				}
				if(menuSelection==5){
					stringObject.compareSmallerValue();
				}
				if(menuSelection==6){
		   			stringObject.randomValue();
				}
				if(menuSelection==7){
					stringObject.roundedNumber();
				}
				if(menuSelection==8){
					stringObject.findSin();
				}
				if(menuSelection==9){
					stringObject.findCos();
				}
				if(menuSelection==10){
					stringObject.findTan();
				}
			}
		}
	}	
}
