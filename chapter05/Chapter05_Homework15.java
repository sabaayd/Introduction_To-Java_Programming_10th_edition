package chapter05;

public class Chapter05_Homework15 {
	public static void main(String[] args) {
		final int NUM = 10;
		int count = 0;	

		
		for (int i = 33; i <= 126; i++) {
			count++;	
			if (count % 10 == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i + " ");	
		}
		System.out.println();
	}

	}


