import java.util.Scanner;

public class b184 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int v, c;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int dp[] = new int[100 + 1];
			for (int i = 0; i < n; ++i) {
				v = scan.nextInt();
				c = scan.nextInt();

				for (int j = 100; j - v >= 0; --j) {
					dp[j] = Math.max(dp[j], dp[j - v] + c);
				}

			}
			System.out.println(dp[100]);
		}
		scan.close();
	}
}