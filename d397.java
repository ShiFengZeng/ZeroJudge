import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d397 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		int[] money = new int[] { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5 };
		long[] dp = new long[30001];
		dp[0] = 1;
		for (int i = 0; i < 11; ++i) {
			for (int j = 0; j < 30001; ++j) {
				if (j >= money[i]) {
					dp[j] += dp[j - money[i]];
				}
			}
		}
		while ((line = br.readLine()) != null) {
			if (!line.equals("0.00")) {
				pw.println(String.format("%s%17d", line, dp[(int) (Double.valueOf(line) * 10000 / 100.0)]));
			} else {
				pw.close();
				break;
			}
		}

	}
}