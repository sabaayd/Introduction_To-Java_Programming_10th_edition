package chapter05;

import java.util.Scanner;

public class Chapter05_Homework01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		
		int sum = 0, pos = 0, neg = 0;
		int num = -1;
		
		while (num != 0) {
			num = input.nextInt();
			
			if (num > 0) {
				pos++;
			} else if (num< 0) {
				neg++;
			} else {
				break;
			}
			
			sum = sum + num;
			
			int totalNum = pos + neg;
			
			if (totalNum == 0 && num == 0) {
				System.out.println("No numbers are entered except 0");
			} else {
				System.out.println("The number of positives is " + pos);
				System.out.println("The number of negatives is " + neg);
				System.out.println("The total is " + sum);
				System.out.println("The avg without zeros is " + sum / totalNum);
		}
				
				
			}
		}
				
	}


