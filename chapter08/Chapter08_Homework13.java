package chapter08;

import java.util.Scanner;

public class Chapter08_Homework13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("how many rows and colums? ");
		int row = input.nextInt();
		int column = input.nextInt();

		double[][] array = new double[row][column];

		System.out.println("array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		int[] location = locateLargest(array);

		System.out.println("the largest element is at (" +
			location[0] + ", " + location[1] + ")");
	}

	public static int[] locateLargest(double[][] a) {
		int[] l = new int[2];
		l[0] = 0;
		l[1] = 0;
		double max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				if (a[i][j] > max) {
					l[0] = i;
					l[1] = j;
					max = a[i][j];
				}
			}
		}
		return l;
	}
}
