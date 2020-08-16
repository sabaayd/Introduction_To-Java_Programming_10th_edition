package chapter05;

import java.util.Scanner;

public class Chapter05_Homework50 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("String: ");
		String a = input.nextLine();
		
		int c = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if (Character.isUpperCase(a.charAt(i))) {
				c++;
				
			}
		}
		
		System.out.println("num of upper: " + c);
	}

}
