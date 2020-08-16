package chapter05;

import java.util.Scanner;

public class Chapter05_Homework38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter en intejer: ");
		int a = input.nextInt();
		
		String octal = "";
		int num = a;
		for (int i = a; i > 0; i /= 8) {
			octal = i % 8 + octal;
			
		}
		
	System.out.println("Octal of " + a + " is " + octal);

}
}