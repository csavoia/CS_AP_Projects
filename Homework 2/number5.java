import java.io.*;
import java.util.*;

public class number5 {
	public static void main(String[] args) throws Exception {
		System.out.print("Enter a number:");
		Scanner in = new Scanner(System.in);
		int N;

		N = in.nextInt();
		int total = 1;
		
		System.out.println("N is " + N);

			for (int i=1; i<N+1; i++) {
				total = total * i;
				System.out.println("..." + total);
			}
		
		System.out.println(N + " factorial is: " + total);
	}
}

/*
import java.io.*;
import java.util.*;

public class number5 {
	public static void main(String[] args) throws Exception {
		System.out.print("Enter a number:");
		Scanner in = new Scanner(System.in);
		int F = 1;
		int M = 1;
		int N;

		N = in.nextInt();
		int total = 1;
		
		System.out.println("N is " + N);
		if (N == 1)
			System.out.println("1");
		else {
			for (int i=1; i!=N+1; i++) {
				total = total * i;
				System.out.println("..." + total);
			}
		}
		
		System.out.println(N + " factorial is: " + total);
	}
}*/