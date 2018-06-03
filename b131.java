import java.util.Scanner;

public class b131 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, m;

		while (scan.hasNext()) {
			N = scan.nextInt();
			m = scan.nextInt();
			int[] dp = new int[N + 1];

			for (int i = 0; i < m; ++i) {
				int v = scan.nextInt();
				int p = scan.nextInt();

				for (int j = N; j - v >= 0; --j) {
					dp[j]=Math.max(dp[j], dp[j-v]+v*p);
				}
			}
			System.out.println(dp[N]);
		}
		scan.close();
	}
}