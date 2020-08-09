package chapter04;

import java.util.Scanner;

public class Chapter04_Homework05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of sides: ");
		System.out.println("Enter the side: ");
		
		double s = input.nextDouble();
		double n = input.nextDouble();
		double area = ((n * s * s)) / (4 * Math.tan(3.145/ n));
		
		System.out.println("The area of the polygon is " + area);
	}

}
