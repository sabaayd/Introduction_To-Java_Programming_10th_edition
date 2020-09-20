package chapter08;

public class Chapter08_Homework18 {
	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

		shuffle(m);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void shuffle(int[][] m) {
		int[] temp = new int[2];

		for (int i = 0; i < m.length; i++) {
			int i1 = (int)(Math.random() * m.length);

			temp[0] = m[i][0];
			temp[1] = m[i][1];
			m[i][0] = m[i1][0];
			m[i][1] = m[i1][1];
			m[i1][0] = temp[0];
			m[i1][1] = temp[1];
		}
	}
}

