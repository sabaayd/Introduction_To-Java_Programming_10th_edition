package chapter05;

import java.util.Scanner;

public class Chapter05_Homework46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("String: ");
		String a = input.nextLine();
		
		System.out.println("reversed: ");
		
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.println(a.charAt(i));
			
		}
	}

}
