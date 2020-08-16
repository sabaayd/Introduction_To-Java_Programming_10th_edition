package chapter05;

public class Chapter05_Homework11 {
	int count = 1; {
	for (int number = 100; number <= 200; number++) {
		if ((number % 5 == 0 || number % 6 == 0) && !(number % 5 == 0 && number % 6 == 0)) {
			System.out.print(number + " ");

			if (count % 10 == 0) {
				System.out.println();
			}
			count++;
		}
	}

}

}

