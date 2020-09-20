package chapter08;

import java.util.Scanner;

public class Chapter08_Homework15 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double[][] points = new double[5][2];

		System.out.print("enter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		
		System.out.println("five points are " + 
			(sameLine(points) ? " " : " not ") + "on the same line");	
	}

	
		for (int i = 0; i < points.length - 2; i += 3) {
			if (pointPosition(points[i][0], points[i][1], points[i + 1][0], 
				points[i + 1][1], points[i + 2][0], points[i + 2][1]) != 0) {
				return false;
			}
		}
		return true;
	}


	public static double pointPosition(double x0, double y0,
	double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}
}
	
}
