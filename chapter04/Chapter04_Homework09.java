package chapter04;

import java.util.Scanner;

public class Chapter04_Homework09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		
		char a = input.next().charAt(0);
		
		System.out.print("The Unicode for the character is " + (int) a);
		
	}

}
