package chapter05;

public class Chapter05_Homework03 {
	public static void main(String[] args) {
	
		final double lbspkg = 2.2;
		
		System.out.println("Kgs        Lbs");
		
		for (int kg = 1; kg <= 199; kg += 2) {
			System.out.printf("%d       %.1f ", kg, (kg * 2.2));
			
		}
		
		
	}

}
