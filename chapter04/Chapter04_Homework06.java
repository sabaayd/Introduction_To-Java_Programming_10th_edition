package chapter04;

public class Chapter04_Homework06 {
	public static void main(String[] args) {
		
		
		final double r = 40;
		
		double a1 = Math.random() * 360;
		double x1 = r * Math.cos(Math.toRadians(a1));
		double y1 = r * Math.sin(Math.toRadians(a1));
		
		double a2 = Math.random() * 360;
		double x2 = r * Math.cos(Math.toRadians(a2));
		double y2 = r * Math.sin(Math.toRadians(a2));
	
		double a3 = Math.random() * 360;
		double x3 = r * Math.cos(Math.toRadians(a3));
		double y3 = r * Math.sin(Math.toRadians(a3));
		
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		System.out.println("The three angles are " +
		a + " and " + b + " and "  + c);
		
		
		
		
		
		
		
	}

}
