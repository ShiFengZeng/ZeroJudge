import java.util.Scanner;

public class a694 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, m;

		while (scan.hasNext()) {
			n = scan.nextInt();
			m = scan.nextInt();

			int num[][] = new int[n ][m ];

			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					num[i][j] = scan.nextInt();
				}
			}
			for (int i = 0; i < m; ++i) {
				int x1 = scan.nextInt();
				int y1 = scan.nextInt();
				int x2 = scan.nextInt();
				int y2 = scan.nextInt();

				int sum = 0;
				for (int j = x1-1; j < x2; ++j) {
					for (int k = y1-1; k < y2; ++k) {
						sum += num[j][k];
					}
				}
				System.out.println(sum);
			}
		}
		scan.close();
	}
}