package chapter05;

import java.util.Scanner;

public class Chapter05_Homework16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("May I please ask you to enter an integer?: ");
		int number = input.nextInt();
		int index = 2;
		
		while(number / index != 1) {
			if (number % index == 0) {
				System.out.println(index + ", ");
				number /= index;
				
			} else { 
				index++;
			
			}
			System.out.println(number + " ");
			
		
			}
		}
	}
