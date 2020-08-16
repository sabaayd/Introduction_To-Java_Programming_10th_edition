package chapter05;

public class Chapter05_Homework27 {
	public static void main(String[] args) {
		
		System.out.print("Leap years between given dates: ");
		int count = 0;
		for (int year = 101; year <= 2100; year++) {
			
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				count++;
				
				System.out.println(year + (count % 10 == 0 ? "/n" : " "));
				
			}
		}
		System.out.println();
	}

}
