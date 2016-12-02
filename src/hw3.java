import java.util.*;
import java.math.*;

public class hw3 {
	//calculates number of days left in year based on provided date
	public static void NumDaysLeftInYear(){
		String month = "";
		System.out.println("What month is it?");
		Scanner sc = new Scanner(System.in);
		month = sc.next();
		month=month.toLowerCase();
		
		int day = 0;
		System.out.println("What day is it?");
		sc = new Scanner(System.in);
		day = sc.nextInt();
		
		int year = 0;
		System.out.println("What year is it?");
		sc = new Scanner(System.in);
		year = sc.nextInt();
		
		//System.out.println(day+"/"+month+"/"+year);
		
		int totalDays = 0;
		if(year%4==0 || (year%100==0 && year%400==0)){
			totalDays=366;
		} else{
			totalDays=365;
		}
		
		int daysLeft=0;
		switch(month){
		case "january":
			daysLeft=totalDays-day;
			break;
		case "february":
			daysLeft=totalDays-31-day;
			break;
		case "march":
			daysLeft=306-day;
			break;
		case "april":
			daysLeft=275-day;
			break;
		case "may":
			daysLeft=245-day;
			break;
		case "june":
			daysLeft=214-day;
			break;
		case "july":
			daysLeft=184-day;
			break;
		case "august":
			daysLeft=153-day;
			break;
		case "september":
			daysLeft=122-day;
			break;
		case "october":
			daysLeft=92-day;
			break;
		case "november":
			daysLeft=61-day;
			break;
		case "december":
			daysLeft=31-day;
			break;			
		}
		
		System.out.println("Days left in the year are: "+daysLeft);
		
	}

}
