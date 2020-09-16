package interview_q;

public class Missingnum {

	public static void main(String[] args) {
		 static int MissingNum (int a[], int n)
		 {
			 int i, total;
			 total = (n + 1) * (n + 2) / 2;
			 
			 for (i = 0; i < n; i++)
				 total -= a [i];
			 return total;
		 }
		public static void main1(String args [])
		{
			int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10};
			int miss = MissingNum (a, 9);
			System.out.println(miss);
		}
	}
}
