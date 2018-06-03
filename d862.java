import java.util.Scanner;

public class d862 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int V;
		int n;
		while (scan.hasNext()) {
			V = scan.nextInt();
			n = scan.nextInt();
			int[] dp = new int[V + 1];
			
			for (int i = 0; i < n; ++i) {
				int vol = scan.nextInt();
				for (int j = V; j - vol >= 0; --j) {
					dp[j] = Math.max(dp[j], dp[j - vol] + vol);
				}
			}
			System.out.println(V - dp[V]);
		}
		scan.close();
	}
}