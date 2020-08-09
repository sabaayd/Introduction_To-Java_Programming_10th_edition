package chapter02;

import java.util.Scanner;

public class Chapter2_Excercise2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a long for seconds: ");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " +
		minutes + " minutes and " + remainingSeconds + " seconds ");
	}

}
