import java.util.Arrays;
import java.util.Scanner;

public class b557 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;
		int N;
		while (scan.hasNext()) {
			T = scan.nextInt();

			for (int i = 0; i < T; ++i) {
				N = scan.nextInt();
				int[] stick = new int[N];
				int total = 0;

				for (int j = 0; j < N; ++j) {
					stick[j] = scan.nextInt();
				}
				Arrays.sort(stick);
				for (int a = 0; a < N - 2; ++a) {
					for (int b = a + 1; b < N - 1; ++b) {
						for (int c = b + 1; c < N; ++c) {
							if (stick[a] * stick[a] + stick[b] * stick[b] == stick[c] * stick[c]) {
								total++;
							}
						}
					}
				}
				System.out.println(total);
			}
		}
		scan.close();
	}
}