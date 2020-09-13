package interview_q;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		
		static boolean rPermutation(String str1, String str2)
		{
		int v1 = str1.length();
		int v2 = str2. length();
		
		if (v1 != v2)
			return false;
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for (int i = 0; i < n1; i++)
			if (ch1 [i] != ch2 [i])
				return false;
		return true;
		
		}
		
		public static void main(String[] args)
		{
			String str1 = "saba";
			String str2 = "ssva";
			
			if (rPermutation(str1, str2))
				System.out.println("yeehaw!");
			else
				System.out.println("no sir");
		
		
	
	}

}
