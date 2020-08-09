package chapter03;

import java.util.Scanner;

public class Chapter03_Homework05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Whats the day today? ");
		int day = input.nextInt();
		
		System.out.print("How many days elapsed from today: ?");
		int daysElapsed = input.nextInt();
		
		int futureDay = (day + daysElapsed) % 7;
		
		System.out.print("Today is ");
		switch (day)
		{
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		}
		
		System.out.println(" and the future dat is ");
		switch (futureDay)
		{
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		
		}
		
		
	}

}
