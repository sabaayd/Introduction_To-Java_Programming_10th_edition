package chapter06;

public class Chapter06_Homework16 {
		
		public static void main(String[] args) {

			for (int i = 2000; i <= 2020; i++) {
				System.out.println(i + " has " + numberOfDaysInAYear(i) + " days");
			}

		}

		public static int numberOfDaysInAYear(int year) {
			int numOfDInY= 0;
			boolean isLeap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
			if (isLeap) {
				numOfDInY = 366;
			} else {
				numOfDInY = 365;
			}

			return numOfDInY;
		}

	
	}


