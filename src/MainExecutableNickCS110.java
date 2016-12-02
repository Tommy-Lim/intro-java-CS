import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MainExecutableNickCS110 {
	
	public static void main(String[] args) throws FileNotFoundException{
		//HW1
			//hw1.TodayIs();
		
		
		//HW2
			//hw2.problemOne();
			//hw2.problemTwo();
		
		
		//HW3
			//hw3.NumDaysLeftInYear();
		
		
		//HW4
			//hw4.convertTemp(45, "C");
			/*System.out.println("Hello.  This program will convert F to C, or vise-versa.");
			System.out.println("To get started please enter a temperature:");
			Scanner sc = new Scanner(System.in);
			double temperature = sc.nextDouble();
			System.out.println("Did you submit C or F?");
			sc = new Scanner(System.in);
			String temperatureScale = sc.next();
			hw4.convertTemp(temperature, temperatureScale);*/
			
			//ManipulateImage.saveImage(ManipulateImage.blackoutWhiteoutImage(ManipulateImage.loadImage("cwu.jpg"), "w"),"cwuWhiteout.jpg");
			/*
			System.out.println("What image do you want to edit? Type q to quit:");
			Scanner sc = new Scanner(System.in);
			String imageName = sc.next();
			if(imageName.equals("q")){
				System.out.println("Okay, bye!");
			} else{
				System.out.println("What action? Invert (v). blackout (b), hide (h), unhide (u), whiteout (w), information (i)");
				sc = new Scanner(System.in);
				String action = sc.next();
				String newName ="";
				switch(action){
				case "v":
					System.out.println("What is the name of the output image?");
					sc = new Scanner(System.in);
					newName = sc.next();
					ManipulateImage.saveImage(ManipulateImage.invertImage(ManipulateImage.loadImage(imageName)),newName);
					System.out.println("Image has been inverted and new name is: "+newName);
					break;
				case "b":
					System.out.println("What is the name of the output image?");
					sc = new Scanner(System.in);
					newName = sc.next();
					ManipulateImage.saveImage(ManipulateImage.blackoutWhiteoutImage(ManipulateImage.loadImage(imageName),action),newName);
					System.out.println("Image has been blacked out and new name is: "+newName);
					break;
				case "h":
					System.out.println("What is the name of the output image?");
					sc = new Scanner(System.in);
					newName = sc.next();
					ManipulateImage.saveImage(ManipulateImage.hideImage(ManipulateImage.loadImage(imageName)),newName);
					System.out.println("Image has been hidden and new name is: "+newName);
					break;
				case "u":	
					System.out.println("What is the name of the output image?");
					sc = new Scanner(System.in);
					newName = sc.next();
					ManipulateImage.saveImage(ManipulateImage.unHideImage(ManipulateImage.loadImage(imageName)),newName);
					System.out.println("Image has been unhidden and new name is: "+newName);
					break;
				case "w":
					System.out.println("What is the name of the output image?");
					sc = new Scanner(System.in);
					newName = sc.next();
					ManipulateImage.saveImage(ManipulateImage.blackoutWhiteoutImage(ManipulateImage.loadImage(imageName),action),newName);
					System.out.println("Image has been whited out and new name is: "+newName);
					break;
				case "i":	
					ManipulateImage.printImageInfo(ManipulateImage.loadImage(imageName), imageName);
					break;
				case "q":
					System.out.println("Okay, bye!");
				}	
			}	
			*/
			
		
		//HW5
				//hw5 can be found under it's own class: NickCS110Casinogambler
		
		
		//HW6
			System.out.println("How many entries in array (int)?");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			double[] numbers = new double[number];
			for(int i=0; i<numbers.length;i++){
				Random randomNumber = new Random();
				double randomDouble = randomNumber.nextDouble();
				numbers[i] = randomDouble*100;
			}
			hw6.printAndsum(numbers);
			hw6.minMaxAverage(numbers);
			
	}
}
