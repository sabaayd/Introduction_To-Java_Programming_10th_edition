package chapter07;

import java.util.Scanner;

public class Chapter07_Homework02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		int[] array = new int[10];

		
			System.out.print("Enter ten integers: ");

		
			fill(array);

		
			for (int i = array.length - 1; i >= 0; i--)
				System.out.print(array[i] + " ");
			System.out.println();
		}


		public static void fill(int[] array) {
			
			Scanner input = null;
			for (int i = 0; i < array.length; i++) 
				array[i] = input.nextInt();
		}
	
	}


