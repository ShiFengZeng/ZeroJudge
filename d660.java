import java.util.Scanner;

public class d660 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;
		int N;
		while (scan.hasNext()) {
			T = scan.nextInt();

			for (int i = 0; i < T; ++i) {
				int highJumps = 0;
				int lowJumps = 0;
				N = scan.nextInt();
				int wall[] = new int[N];

				for (int j = 0; j < N; ++j) {
					wall[j] = scan.nextInt();
				}

				for (int k = 0; k < N - 1; ++k) {
					if (wall[k] > wall[k + 1]) {
						lowJumps++;
					} else if (wall[k] < wall[k + 1]) {
						highJumps++;
					}
				}
				System.out.println(String.format("Case %d: %d %d", i + 1, highJumps, lowJumps));
			}
		}
		scan.close();
	}
}