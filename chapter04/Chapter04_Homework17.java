package chapter04;

import java.util.Scanner;

public class Chapter04_Homework17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What's the year fam: ");
		int year = input.nextInt();
		
		System.out.print("What about the month tho... ");
		String m = input.next();
		
		boolean leapYear =
				((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	if (m == ("Jan") || m== ("Mar") ||
				m == ("May") || m== ("Jul") ||
				m== ("Aug") || m== ("Oct") ||
				m == ("Dec")) {
		System.out.println(31 + " days");
		
	}else if (m == ("Apr") || m == ("Jun") ||
				m == ("Sep") || m == ("Nov")) {
		System.out.println(30 + " days");
	}else { 
		System.out.println(((leapYear) ? 29 : 28 + " days."));
		
	}
	
	}

}
