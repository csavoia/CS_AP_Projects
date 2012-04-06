import java.util.*;

public class number1 {
	public static void main(String[] args){
						
		while(true){
			
			//set up error catcher boolean to determine whether or not string will be printed

			Scanner in = new Scanner(System.in);
			
			boolean error = true;
			
			System.out.println("Please enter a binary number to convert to an integer.");
			
			//Accept input for string that will convert to array
			String binaryInput = in.nextLine();
			
			//Binary string to array
			char[] binaryArray = binaryInput.toCharArray();
			
			//Create variable for integer (set to 0 for when it loops)
			double binaryConverted = 0;
		
			for( int i=0; i < binaryArray.length; i++){
				
				error = false;
				
				//if string value is 0
				if( binaryArray[i] == '0'){
										
				}
				//if string value is 1
				else if( binaryArray[i] == '1'){
										
					binaryConverted = binaryConverted + Math.pow(2, binaryArray.length - i -1);
					

				}
				//error catcher
				else {

					System.out.println("\nYou have entered an invalid numeric value. Please only enter 1s and 0s.\n");
					
					//sets i equal to array length so that the loop will stop
					i = binaryArray.length;
					error = true;
					
				}
								
			}
			
			//if error is true, the loop will simply repeat and skip past this
			if(error != true){

				System.out.println("The binary string " + binaryInput + " is " + (int)binaryConverted + " in integer form.\n");
			}
		}
	}
}
