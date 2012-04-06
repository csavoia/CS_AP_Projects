
public class number2 {
	public static void main(String[] args){
		int randomNumber = (int) (Math.random() * 100 );
		System.out.println("Counting to: " + randomNumber);
		
		int startNumber = 1;
		System.out.println(startNumber);
		
		do{
			startNumber = startNumber + 1;
			System.out.println(startNumber);
		}while(startNumber < randomNumber);
	}
}
