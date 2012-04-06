import java.util.Scanner;


public class number2 {
		
	public static void main(String[] args) {

		//initialize scanner
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Please input a number between 1 and 1023 to convert to binary.");
		
		String binaryStr = ""; // This string will hold the result
		
		//input to convert
		int inputNumber = in.nextInt();
		
		if(inputNumber > 1023){
			error();
		}
		while (inputNumber > 0 && inputNumber <= 1023 ){
			binaryStr = (inputNumber % 2) + binaryStr;
			inputNumber = inputNumber/2;
		}
		System.out.println(binaryStr);
	}
	
	public static void error(){
		System.out.println("You have entered an invalid value.");
	}
}
