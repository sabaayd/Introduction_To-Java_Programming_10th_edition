package chapter03;

import java.util.Scanner;

public class Chapter03_Homework03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.print ("Enter values for a, b, c, d, e, and f: ");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double d = input.nextDouble();
	double e = input.nextDouble();
	double f = input.nextDouble();
	
	if (a * d - b * c == 0)
		System.out.println("NO SOLUTION LOSER :]");
	else
	{
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		System.out.println("x is " + x + " and y is " + y);
	}

		
		
	}

}
