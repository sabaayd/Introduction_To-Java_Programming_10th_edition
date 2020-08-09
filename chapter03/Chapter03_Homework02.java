package chapter03;

import java.util.Scanner;

public class Chapter03_Homework02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		int c = (int)(Math.random() * 10);
		
		System.out.print(
				"What is " + a + " + " + b + " + " + c + " ? ");
		int answer = input.nextInt();
		
		System.out.println(
				"The sum of a + b + c is: " + (a + b + c == answer));
		
		
		
		
		
		
	}

}
