package chapter04;

import java.util.Scanner;

public class Chapter04_Homework11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal value (0 to 15): ");
		int v = input.nextInt();
		
		if (v >= 0 && v<= 9) {
			System.out.println("The hex value is " + v);
		}else if (v >= 10 && v <= 15) {
			System.out.println("The hex value is " + (char)v);
		}else {
			System.out.println(v + " is an invalid input. ");
		}
	}

}
