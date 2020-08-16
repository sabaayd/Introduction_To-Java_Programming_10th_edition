package chapter05;

import java.util.Scanner;

public class Chapter05_Homework37 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Integer: ");
	int a = input.nextInt();
	
	String bnry = "";
	int num = a;
	while (num != 0) {
		int dgt = num % 2;
		bnry = dgt + bnry;
		num = num / 2;
	}
	
	System.out.println("Ze binary velu ov di dezimal \"" + a + "\" iz: " + bnry);

}
}