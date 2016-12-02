import java.util.*;
import java.math.*;


public class hw6 {
	
	public static void printAndsum(double[] numbers){
		double sumNumbers = 0;
		for(int i=0; i<numbers.length;i++){
			sumNumbers = sumNumbers+numbers[i];
		}
		System.out.println("Array is: "+Arrays.toString(numbers));
		System.out.println("Array sum is: "+sumNumbers);
	}
	
	public static void minMaxAverage(double[] numbers){
		double sumNumbers = 0;
		double minNumbers = numbers[0];
		double maxNumbers = numbers[0];
		double averageNumbers = 0;
		for(int i=0; i<numbers.length;i++){
			sumNumbers = sumNumbers+numbers[i];
			if(numbers[i]<minNumbers){
				minNumbers=numbers[i];
			}
			if(numbers[i]>maxNumbers){
				maxNumbers=numbers[i];
			}
		}
		averageNumbers = sumNumbers/(numbers.length);
		System.out.println("Array Min: "+minNumbers+"; Average: "+averageNumbers+"; Max: "+maxNumbers);
	}
	
	
	
	
}
