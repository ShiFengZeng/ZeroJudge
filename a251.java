import java.util.Arrays;
import java.util.Scanner;

public class a251 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;
		int N;
		int[] S = new int[20];
		while (scan.hasNext()) {
			T = scan.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < T; ++i) {
				N = scan.nextInt();
				int mid = (N - 1) / 2;
				for (int j = 0; j < 4; ++j) {
					S[j] = scan.nextInt();
				}
				for (int j = 4; j < N; ++j) {
					S[j] = S[j - 4] + S[j - 1];
				}
				Arrays.sort(S, 0, N);
				sb.append(S[mid] + "\n");
			}
			System.out.print(sb);
		}
		scan.close();
	}
}