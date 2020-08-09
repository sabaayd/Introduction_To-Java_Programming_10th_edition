package chapter02;

import java.util.Scanner;

public class Homework2_09 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0, v1, and t: ");
		
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		System.out.println("The average acceleration is " +
		((v1 - v0) / t));
		
	
		
	}

}
