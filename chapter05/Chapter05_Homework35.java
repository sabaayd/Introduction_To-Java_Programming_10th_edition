package chapter05;

public class Chapter05_Homework35 {
	public static void main(String[] args) {
		
		double sum = 0;
		
		for (int i = 1; i < 625; i++) {
			sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
			
		}
		System.out.println("Sum is: " + sum);
	}
	}


