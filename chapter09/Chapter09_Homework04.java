package chapter09;

public class Chapter09_Homework04 {

	public static void main(String[] args) {
		Random random = new Random(1000);

		for (int i = 0; i < 50; i++)
			System.out.println(random.nextInt(100));
	}

}
