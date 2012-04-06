import java.io.*;
import java.util.*;


class ArrayListDemo{
	
	public ArrayList<Integer> intList;
	public ArrayList<String> strList;
	
	public ArrayListDemo( ArrayList<Integer> intList, ArrayList<String> strList ){
		this.intList = intList;
		this.strList = strList;
	}
	
	public static void printArrayList(){
		//access array
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		//add values for 1-10
		for( int i=1; i <= 10; i++){
			intList.add(i);
		}
		
		System.out.println(intList);
	}
	
	public static void printShuffle(){
		//access array
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		//add values for 1-10
		for( int i=1; i <= 10; i++){
			intList.add(i);
		}
		
		//prints non-shuffled list
		System.out.println(intList);
		
		//shuffles list
	    Collections.shuffle(intList);

	    //prints shuffled list
		System.out.println(intList);
	    
	}

	public static void stringListPrint(){
		//access array
		ArrayList<String> strList = new ArrayList<String>();
		
		//input values for array
		strList.add("Cats");
		strList.add("Dogs");
		strList.add("Lemurs");
		strList.add("Chimpanzees");
		strList.add("Fishes");
		strList.add("Birds");
		strList.add("Sharks");
		strList.add("Dinosaurs");
		strList.add("Squirrels");
		strList.add("Bears");
		
		System.out.println(strList);
	}
	
	public static void shuffleStringList(){

		
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("Cats");
		strList.add("Dogs");
		strList.add("Lemurs");
		strList.add("Chimpanzees");
		strList.add("Fishes");
		strList.add("Birds");
		strList.add("Sharks");
		strList.add("Dinosaurs");
		strList.add("Squirrels");
		strList.add("Bears");
		
		//print unshuffled list
		System.out.println(strList);
		
		//shuffle list
		Collections.shuffle(strList);
		
		//print shuffled list
		System.out.println(strList);
	}

	public static void randomSort(){
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		//add values for 1-10 within 100
		for( int i=1; i <= 10; i++){
			int arrayValue = (int)(Math.random()*100);
			intList.add(arrayValue);
		}
	
		//print list
		System.out.print(intList);
		
		//sort list
		Collections.sort(intList);
		
		
		//print list
		System.out.println("\n" + intList);
	}
	
	public static void arrayListWords(){
		System.out.println("Please enter a sentence.");
		
		Scanner in = new Scanner(System.in);
		Scanner scanner = new Scanner(in.nextLine());
		
		while(scanner.hasNext()){
			System.out.println(scanner.next());
		}
 	}
	
	public static void arrayListSubstring(){
		System.out.println("Please enter a sentence.");
		
		Scanner in = new Scanner(System.in);
		Scanner scanner = new Scanner(in.nextLine());
		
		//checks for words, repeats
		while(scanner.hasNext()){
			System.out.print(scanner.next().substring(0, 2) + " ");
		}
		System.out.println();
	}
		
	public static void arrayListReverse(){
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a sentence to print in reverse.");
		
		//create arraylist
		ArrayList<String> strList = new ArrayList<String>();
		Scanner sentence  = new Scanner(in.nextLine());
		
		//adds each word from sentence variable
		while( sentence.hasNext()){
			strList.add(sentence.next());
		}
		
		//prints in reverse
		for( int i = strList.size(); i - 1 >=0; i--){
			System.out.print(strList.subList( i - 1, i ) + " " + "\n");
		}
			
	}
	
	
	
}

public class number1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int selection;
		
		while(true){
			System.out.println("1. ArrayList from 1-10\n2. ArrayList of 1-10, shuffle\n3. ArrayList of 10 strings\n4. ArrayList of 10 strings, shuffle\n5. ArrayList of random numbers, sort\n6. Sentence to ArrayList\n7. Substring sentence\n8. Reverse sentence");

			selection = in.nextInt();
			
			if(selection == 1){
				ArrayListDemo.printArrayList();
			}
			if(selection == 2){
				ArrayListDemo.printShuffle();
			}
			if(selection == 3){
				ArrayListDemo.stringListPrint();
			}
			if(selection == 4){
				ArrayListDemo.shuffleStringList();
			}
			if(selection == 5){
				ArrayListDemo.randomSort();
			}
			if(selection == 6){
				ArrayListDemo.arrayListWords();
			}
			if(selection == 7){
				ArrayListDemo.arrayListSubstring();
			}
			if(selection == 8){
				ArrayListDemo.arrayListReverse();
			}
		}
		
	}

}