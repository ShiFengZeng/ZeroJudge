import java.util.Scanner;

public class c161 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int[][] a = new int[n][n];
			int number = 1;

			for (int j = 0; j < (n + 2) / 2 - 1; ++j) {
				for (int k = 0; k < n - 2 * j; k++) {
					a[j][k + j] = number;
					number++;
				}
				for (int k = 1; k < n - 2 * j; ++k) {
					a[k + j][n - j - 1] = number;
					number++;
				}
				for (int k = 1; k < n - 2 * j; ++k) {
					a[n - j - 1][n - k - j - 1] = number;
					number++;
				}
				for (int k = 1; k < n - 2 * j - 1; ++k) {
					a[n - k - j - 1][j] = number;
					number++;

				}
				if (n % 2 == 1) {
					a[n / 2][n / 2] = n * n;
				}
			}
			System.out.print(a[x - 1][y - 1]);
		}
		scan.close();
	}
}
