package chapter04;

import java.util.Scanner;

public class Chapter04_Homework02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double RADIUS = 6371.01;
		
		System.out.print("Enter p1: ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
	
		System.out.println("Enter p2: ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		
		double d = RADIUS * Math.acos((Math.sin(x1) *
				Math.sin(x2)) + ((Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));
		System.out.println("The distance between the two points is " + d + " km");
		
				
				
		
	}

}
