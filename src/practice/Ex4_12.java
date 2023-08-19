package practice;

public class Ex4_12 {

	public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 3; i++) { for (int j = 2; j <= 4; j++) {
		 * System.out.printf("%d*%d=%d\t", j, i, i * j); } System.out.println();
		 * 
		 * } System.out.println();
		 * 
		 * for (int i = 1; i <= 3; i++) { for (int j = 5; j <= 7; j++) {
		 * System.out.printf("%d*%d=%d\t", j, i, i * j); } System.out.println();
		 * 
		 * } System.out.println();
		 * 
		 * for (int i = 1; i <= 3; i++) { for (int j = 8; j <= 9; j++) {
		 * System.out.printf("%d*%d=%d\t", j, i, i * j); } System.out.println();
		 * 
		 * }
		 */
		for (int k = 1; k <= 3; k++) {
			for (int i = 1; i <= 3; i++) {
				for (int j = k * 3 - 1; j <= k * 3 + 1; j++) {
					if (j == 10)
						break;
					System.out.printf("%d*%d=%d\t", j, i, i * j);
				}
				System.out.println();

			}
			System.out.println();
		}

	}
}