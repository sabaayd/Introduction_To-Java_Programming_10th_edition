package chapter06;

import java.util.Scanner;

public class Chapter06_Homework04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you mind entering an integer so I can do this hw please and thank you: ");
		
		int num = input.nextInt();
		
		System.out.println(reverse(num));
		
	}
public static int reverse(int num) {
	while (num > 0) {
		System.out.println((num % 10));
		num /= 10;
	}
return num;
}
}
