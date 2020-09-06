package chapter06;

import java.util.Scanner;

public class Chapter06_Homework06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numofro = input.nextInt();
		
		displayPattern(numofro);
	}

	public static void displayPattern(int n) {
		int space = n - 1;
		
		for (int i = 1; i <= n; i++) {
		for (int j = 0; j < space; j++) {
			System.out.print(" ");
			
		for (int k = i; k > 0; k--) {
			System.out.print(k + " ");
		}
		System.out.println();
		space--;
		}
		}
	}
}
