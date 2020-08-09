package chapter04;

import java.util.Scanner;

public class Chapter04_Homework15 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		char c = toUpperCase(input.next().charAt(0));
		
		System.out.print("Would you mind entering a number please? ");
		
		if(c <= 'A' && c <= 'Z') {
			switch (c) {
			
			case ('A'): System.out.println("The corresponding number is 2 ");
			
			
			}
		}
		
		
		
	}

	private static char toUpperCase(char charAt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
