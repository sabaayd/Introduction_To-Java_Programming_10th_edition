package chapter05;

import java.util.Scanner;

public class Chapter05_Homework21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan: ");
		double loan = input.nextDouble();
		System.out.print("Years: ");
		double years = input.nextDouble();
		
		System.out.println(
				"Int Rate   Monthly  Total");
		for (double i = 5.0; i <= 8; i += 0.125) {
			System.out.printf("%-5.3f", i);
			System.out.print("%           ");
			double IntRate = i / 1200;
			double monthly = loan * IntRate / (1 - 1 / Math.pow(1 + IntRate, years * 12));
			System.out.printf("%-19.2f", monthly);
			System.out.printf("%-8.2f\n",(monthly * 12) * years);
			
		}
	}

}
