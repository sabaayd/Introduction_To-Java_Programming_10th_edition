package chapter06;

public class Chapter06_Homework01 {
	public static void main(String[] args) {
		final int numofpen = 100;
		final int numperlin = 10;
		
		System.out.println("first 100 pentagonal numbers: ");
		
		for (int i = 1; i <= numofpen; i++) {
			
			if (i % numperlin == 0) {
				System.out.println(getPentagonalNumber(i) + " /n");
				
			} else {
				System.out.println(getPentagonalNumber(i) + " ");
			}
				
		}
	}
	
	public static int getPentagonalNumber(int n) {
		
		return n * (3 * n - 1) / 2;
	}

}
