package chapter03;

import java.util.Scanner;

public class Chapter03_Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int answer = number1 + number2;
		
		System.out.println("What is " + number1 + "+" + number2 +
				"?");
		int number = input.nextInt();
		
		System.out.println(
				number1 + " + " + number2 + " = " + answer +" is " +
		(number1 + number2 == answer));
		
		
		
		
		
	}

}
