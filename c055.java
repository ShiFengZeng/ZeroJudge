import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c055 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] dp = new int[10001];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 6;
		dp[4] = 24;
		for (int i = 5; i <= 10000; ++i) {
			dp[i] = dp[i - 1] * i;

			while (dp[i] % 10 == 0) {
				dp[i] /= 10;
			}
			dp[i] %= 100000;
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			String[] s = str.split(" ");
			int n = Integer.valueOf(s[0]);

			System.out.println(String.format("%4d -> %d", n, dp[n] % 10));
		}
	}
}