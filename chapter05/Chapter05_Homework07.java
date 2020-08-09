package chapter05;

public class Chapter05_Homework07 {
	public static void main(String[] args) {
		int totalCost = 0;
		int tuition = 10000;
		int tenth = 0;
		
		for (int yr = 1; yr <= 14; yr++) {
			tuition += (tuition * 0.05);
			
			if (yr > 10) {
				totalCost += tuition;
			
			if (yr == 10)
				tenth = tuition;
			
		System.out.println("The unnecessary amount of tuition in ten years: $ " + tenth);
		
		System.out.println("You really are expected to pay " + totalCost);
		
			
			}
		}
		
	}

}
