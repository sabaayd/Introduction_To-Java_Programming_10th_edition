package chapter05;

import java.util.Scanner;

public class Chapter05_Homework49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("String: ");
	
	String a = input.nextLine().toUpperCase();
	
	int numofv = 0;
	int numofc = 0;
	
	for (int i = 0; i < a.length(); i++) {
		
		if (Character.isLetter(a.charAt(i))) {
			
			if (a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U' ) {
				numofv++;
			} else {
				numofc++;
			
			}
		
		}
	}
	System.out.println("vowels: " + numofv);
	System.out.println("consonants: " + numofc);
	}

}
