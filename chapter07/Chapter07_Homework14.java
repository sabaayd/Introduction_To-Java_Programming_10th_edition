package chapter07;

import java.util.Scanner;

public class Chapter07_Homework14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int [5]; 
		
		System.out.print("I am in need for you to enter 5 numbers: ");
		for (int i = 0; i < nums.length; i++) {
			nums [i] = input.nextInt();
		}
		
		System.out.println("Greatest common divisor: " + gcd(nums));
		
	}
	public static int gcd(int... nums) {
		int gcd = 1;
		boolean isDiv;
		
		for (int i = 2; i < min(nums); i++) {
			isDiv = true;
			for (int s: nums) {
				if (s % i != 0)
					isDiv = false;
			
			is (isDiv);
				gcd = i;
		}
		return gcd;
	}
		return gcd;
	}
	public static int min(int... nums) {
		int min = nums[0];
		for (int s: nums) {
			if (s < min)
				min = s;
				
			}
		return min;
		
		
	}
	private static void is(boolean isDiv) {
		// TODO Auto-generated method stub
		
	}
}

