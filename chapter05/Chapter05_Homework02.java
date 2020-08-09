package chapter05;

import java.util.Scanner;

public class Chapter05_Homework02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	int numofq = 10;
	int cierto = 0;
	int count = 0;
	
	long startTime = System.currentTimeMillis();
	String otpt = " ";
	
	while (count < numofq) {
		int num1 = 1 + (int)(Math.random() * 15);
		int num2 = 1 + (int)(Math.random() * 15);
		
	System.out.print("What is " + num1 + " + " + num2 + " ? ");
	int answer = input.nextInt();
	
	if (num1 + num2 == answer) {
		System.out.println("Cierto guapo!");
		cierto++;
	} else {
		System.out.println("What a shame...\n" + num1
				+ " + " + num2 + " is actually " + (num1 + num2));
		count++;
		
		otpt += "\n" + num1 + "+" + num2 + "=" + answer +
				((num1 + num2 == answer) ? " cierto" : " falso");
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println(" Finally you scored " + cierto + " corrects "
				+ "\nTest time is " + testTime / 1000 + " seconds\n" + otpt);
	}
	}
		
	}

}
