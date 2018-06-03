import java.util.Scanner;

public class d985 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int i = 1; i <= n; ++i) {
				int m = scan.nextInt();
				int total = 0;
				int totalForEach = 0;
				int minTotalForEach = 0;
				int minA = 0;
				int minB = 0;
				int avgA = 0;
				int avgB = 0;
				int[] a = new int[m];
				int[] b = new int[m];
				minTotalForEach = Integer.MAX_VALUE;

				for (int j = 0; j < m; ++j) {
					a[j] = scan.nextInt();
					b[j] = scan.nextInt();

					total += a[j] * 60 + b[j];
					totalForEach = a[j] * 60 + b[j];

					if (minTotalForEach > totalForEach) {
						minTotalForEach = totalForEach;
						minA = a[j];
						minB = b[j];
					}
				}
				avgA = total / m / 60;
				avgB = total / m % 60;
				System.out.println(String.format("Track %d:", i));
				System.out.println(String.format("Best Lap: %d minute(s) %d second(s).", minA, minB));
				System.out.println(String.format("Average: %d minute(s) %d second(s).", avgA, avgB));
			}
		}
	}
}
