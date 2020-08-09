package chapter04;

import java.util.Scanner;

public class Chapter04_Homework18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String major = input.nextLine();
		
		char m = Character.toUpperCase(major.charAt(0));
		char s = major.charAt(0);
		
		switch(m)
		{
			case 'M': System.out.print("Mathematics "); break;
			case 'C': System.out.print("Computer Science "); break;
			case 'I': System.out.print("Information Technology"); break;
			default : System.out.println("Invalid input");
						 System.exit(1);
		}

		switch(s)
		{
			case '1': System.out.println("Freshman"); break;
			case '2': System.out.println("Sophomore"); break;
			case '3': System.out.println("Junior"); break;
			case '4': System.out.println("Senior"); break;
			default : System.out.println("Invalid input");
		}
	}
}