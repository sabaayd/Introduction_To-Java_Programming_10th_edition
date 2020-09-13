package interview_q;

import java.util.Scanner;

public class Unique {
	public static void main1(String[] args) {
		Scanner input = new Scanner(System.in);
	}
		boolean uniqueC (String str) {
			for (int i = 0; i < str.length(); i++) {
				for (int k = i + 1; k < str.length(); k++) {
					if (str.charAt (i) == str.charAt(k))
						return false;
				
					if (str.charAt(i) != str.charAt(k))
					    return true;
				}
			}
			}
				
			public static void main(String args[])
			{
				Unique obj = new Unique();
				String input = "InarAcademy";
				
				if (obj.uniqueC(input))
					System.out.println("This " + input + " is what you were looking for all along.");
				else
					System.out.println("This ain't it fam");
							
			}
}
