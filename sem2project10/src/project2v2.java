import java.util.*;

class Bank{
	
	public static String userName;

	public Bank(String userName){
		this.userName = userName;
	}
}
public class project2v2 {
	public static void main(String[] args){
		Bank[] user = new Bank[1];
		user[0] = new Bank("jewman");
		
		System.out.println(user[0].userName);
	}
}
