package chapter06;

import java.util.Scanner;

public class Chapter06_Homework05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Three integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		displaySortedNumbers(num1, num2, num3);
		
	}
public static void displaySortedNumbers(
		int num1, int num2, int num3) {
	int temp;
	
	if (num2 < num1 && num2 < num3) {
		temp = num1;
		num1 = num1 = num2;
		num2 = temp;
	}
	else if (num3 < num1 && num3 < num2) {
		temp = num1; 
		num1 = num3;
		num3 = temp;
	}
	if (num3 < num2) {
		temp = num2;
		num2 = num3;
		num3 = temp;
	}
	
	System.out.println(num1 + " " + num2 + " " + num3);

}
}
