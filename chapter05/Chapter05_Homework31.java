package chapter05;

import java.util.Scanner;

public class Chapter05_Homework31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Initial dep: ");
		double dep = input.nextDouble();
		
		System.out.println("Annual percentge yield: ");
		double intRate = input.nextDouble();
		
		System.out.println("Maturity pr: ");
		int mths = input.nextInt();
		
		double mintRate = intRate / 1200;
		
		double value = dep;
		System.out.println("Mth      Value");
		for (int i = 1; i <= mths; i++) {
			value = value + (value * mintRate);
			
			System.out.printf("%2d %20.2f \n", i, value);
		}
	}

}
