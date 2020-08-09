package chapter02;

import java.util.Scanner;

public class Homework2_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in celsius: ");
		
		double celsius = input.nextDouble();
		double fahrenheit =  (9.0 / 5) * celsius + 32.0;
		
		System.out.println(celsius + " celsius degrees is " +
		fahrenheit + " fahrenheit degrees ");
		
	}

}
