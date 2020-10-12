import java.util.Scanner;

public class MyDay {
	private int day;
	
	public MyDay(int day) {
		this.day = day;
	}	
	
	public int getDay(int day) {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public static String matchDay(int day) {
		String dayReturn = " ";
		switch(day) {
		case 0:
			dayReturn = "Sunday";
			break;
		case 1:
			dayReturn = "Monday";
			break;
		case 2:
			dayReturn = "Tuesday";
			break;
		case 3:
			dayReturn = "Wednesday";
			break;
		case 4:
			dayReturn = "Thursday";
			break;
		case 5:
			dayReturn = "Friday";
			break;
		case 6:
			dayReturn = "Saturday";
			break;
		}
		return dayReturn;
	}
	
	public static String returnNextDay(int day) {
		int nextDayInt = day + 1;
		if(day == 6)
			nextDayInt = 0;
		String nextDay = matchDay(nextDayInt);
		return nextDay;
	}
	
	public static String returnPreviousDay(int day) {
		int previousDayInt = day - 1;
		if(day == 0)
			previousDayInt = 6;
		String previousDay = matchDay(previousDayInt);
		return previousDay;
	}
	
	public static void printInfo(int day) {
		String newDay = matchDay(day);
		System.out.println("You chose: " + newDay);
		String previousDay = returnPreviousDay(day);
		System.out.println("The day before was: " + previousDay);
		String nextDay = returnNextDay(day);
		System.out.println("Next day is: " + nextDay);
	}
	
	public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 		 
			System.out.println("Enter the number from 0 to 6: ");
			int day = scan.nextInt();
			MyDay myDay = new MyDay(day);
			myDay.printInfo(day);		
}
}