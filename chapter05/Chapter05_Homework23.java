package chapter05;

public class Chapter05_Homework23 {
	public static void main(String[] args) {
		double LefttoRight = 0.0;
		for (double i = 1.0; i <= 50000.0; i++) {
			LefttoRight += 1 / i;
			
		}
		System.out.println("Sum of nums from l to r: " + LefttoRight);
		
		double RighttoLeft = 0.0;
		for (double i = 50000.0; i >= 1.0; i--) {
			RighttoLeft += 1 / i;
		}
		System.out.println("Sum of nums from r to l: " + RighttoLeft);
		
		System.out.println("l to r - " + "r to l: " + (RighttoLeft - LefttoRight));
		}
	}
	

