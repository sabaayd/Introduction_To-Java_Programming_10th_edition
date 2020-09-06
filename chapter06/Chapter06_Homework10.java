package chapter06;

public class Chapter06_Homework10 {

	public static class Exercise_06_10 {

		public static void main(String[] args) {
			int numberOfPrimes = 0;	

			for (int i = 1; i < 1000; i++) {
				if (PrimeNumberMethod.isPrime(i))
					numberOfPrimes++;  
			}

			System.out.println(
				"The number of prime numbers less than 10000: " + numberOfPrimes);
		}
	}
}
