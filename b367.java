import java.util.Scanner;

public class b367 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;

		while (scan.hasNext()) {
			T = scan.nextInt();
			for (int i = 0; i < T; ++i) {
				int N = scan.nextInt();
				int M = scan.nextInt();
				int[][] num = new int[N][M];

				for (int j = 0; j < N; ++j) {
					for (int k = 0; k < M; ++k) {
						num[j][k] = scan.nextInt();
					}
				}

				boolean isTure = true;
				for (int j = 0; j < (N + 1) / 2; ++j) {
					for (int k = 0; k < M; ++k) {
						if (num[j][k] != num[N - j - 1][M - k - 1]) {
							isTure = false;
							break;
						}
					}
				}
				if(isTure) {
					System.out.println("go forward");
				}else {
					System.out.println("keep defending");
				}
			}

		}
		scan.close();
	}
}