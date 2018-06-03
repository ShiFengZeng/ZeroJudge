import java.util.Scanner;

public class a540 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			
			if (n == 0) {
				System.out.print(sb);
				break;
			}

			
			int[] dp = new int[n + 1];
			int win = 0;

			for (int i = 1; i <= n; ++i) {
				int amount = scan.nextInt();
				dp[i] = Math.max(amount, dp[i - 1] + amount);
				win = Math.max(win, dp[i]);
			}

			if (win > 0) {
				sb.append(String.format("The maximum winning streak is %d.\n", win));
			} else {
				sb.append("Losing streak.\n");
			}
		}
		scan.close();
	}
}