package chapter04;

import java.util.Scanner;

public class Chapter04_Homework14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		
		char l = input.next().charAt(0);
		
		if (l >= 'A' || l <= 'E' || l != 'F') {
		
			System.out.print("The numeric value of the letter " + l + " is");
		
		switch (l) {
		
		case ('A'): System.out.println(" 1");break;
		case ('B'): System.out.println(" 2");break;
		case ('C'): System.out.println(" 3");break;
		case ('D'): System.out.println(" 4");break;
		case ('E'): System.out.println(" 5");
		
		}
		
		} else {
			System.out.println("Bi$h please. ");
		
		


		
		}
		
	}

}
