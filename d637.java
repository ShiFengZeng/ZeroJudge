import java.util.Scanner;

public class d637 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			int[] dp = new int[101];
			for (int i = 0; i < n; ++i) {
				int a = scan.nextInt();
				int b = scan.nextInt();

				for (int j = 100; j - a>= 0; --j) {
					dp[j] = Math.max(dp[j], dp[j - a] + b);
				}
			}
			System.out.println(dp[100]);
		}
		scan.close();
	}
}