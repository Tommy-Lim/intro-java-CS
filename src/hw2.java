import java.util.*;
import java.io.*;
import java.math.*;

public class hw2 {
	
	//this program will take in a list of first and last names to create a "DJ" name with substrings
	public static void problemOne() throws FileNotFoundException{
		File f = new File("DJnames.txt");
		Scanner sc = new Scanner(f);
		ArrayList<String> words = new ArrayList<String>(); 
		String word="";
		while(sc.hasNext()){
			word=sc.next();
			words.add(word);
		}
		
		//use an array list from test to determine all names
		System.out.println(words);
		for(int i=0;i<words.size()/2;i++){
			String firstLetters="";
			String lastLetters="";
			firstLetters=words.get(2*i).substring(0, words.get(2*i).length()/2);
			lastLetters=words.get(2*i+1).substring(words.get(2*i+1).length()/2,words.get(2*i+1).length()-1);
			lastLetters.toLowerCase();
			//System.out.println(firstLetters);
			//System.out.println(lastLetters);
			System.out.println("What is your first name? "+words.get(2*i));
			System.out.println("What is your last name? "+words.get(2*i+1));
			System.out.println("Your DJ name is "+firstLetters+lastLetters+"sizzle");
		}
		
		//add names with a system input at console
		/*Scanner sc2 = new Scanner(System.in);
		word = sc2.nextLine();
		System.out.println("Input is: "+word);*/
	}
	
	
	//this problem takes inputs for radius, length, and width to produce the different perimeter
	public static void problemTwo(){
		System.out.println("What is the radius of the circle?");
		String radius = "";
		Scanner sc = new Scanner(System.in);
		radius = sc.nextLine();
		double r = Double.valueOf(radius);
		
		System.out.println("What is the length of the rectangle?");
		String length = "";
		sc = new Scanner(System.in);
		length = sc.nextLine();	
		
		System.out.println("What is the width of the rectangle?");
		double l = Double.valueOf(length);
		String width = "";
		sc = new Scanner(System.in);
		width = sc.nextLine();
		double w = Double.valueOf(width);
		
		System.out.println("The circumference of the circle is: "+(2*Math.PI*r));
		System.out.println("The perimeter of the rectangle is: "+(l*2+w*2));
	}
	
	
}
