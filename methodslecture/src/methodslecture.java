import java.util.Scanner;

/*public class methodslecture {
	   public static void main(String[] args){
		   {
			   //call the method
			   draw_L();
		   }
	   }
	   
//void means the method doesn't return anything
public static void draw_L()
{

	 //prints out the letter l
	 System.out.println(".__ ");  
	 System.out.println("|  |");  
	 System.out.println("|  |");  
	 System.out.println("|  |_");
	 System.out.println("|____/");
	  	
}   

}*/

public class methodslecture {
	   public static void main(String[] args){

			int x = 10;
			double result = doesSomething(x);
			System.out.println(result);
			
		}
		
		public static double doesSomething(int num)
		{
			double something;
			something = 7.4 * num * num;
			return something;
		}
}