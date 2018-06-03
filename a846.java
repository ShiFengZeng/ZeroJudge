import java.util.Scanner;

public class a846 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;

		while (scan.hasNext()) {
			T = scan.nextInt();

			for (int i = 0; i < T; ++i) {
				int N = scan.nextInt();
				int W = scan.nextInt();
				int[] score = new int[N];

				for (int j = 0; j < N; ++j) {
					score[j] = scan.nextInt();
				}
				for (int k = 0; k < W; ++k) {
					int K = scan.nextInt();

					if (K == 1 || K == 2) {
						int X = scan.nextInt();
						int Y = scan.nextInt();

						if (K == 1)
							System.out.println(calMaxScore(X, Y, score));
						else {
							System.out.println(calAvgScroe(X, Y, score));
						}

					} else {
						int E = scan.nextInt();
						System.out.println(score[E]);
					}
				}
			}
		}
		scan.close();
	}

	public static int calMaxScore(int x, int y, int[] score) {
		int max = Integer.MIN_VALUE;
		for (int i = x; i <= y; ++i) {
			if (max < score[i]) {
				max = score[i];
			}
		}
		return max;
	}

	public static int calAvgScroe(int x, int y, int[] score) {
		int totalScore = 0;
		int stuNum = y - x + 1;

		for (int i = x; i <= y; ++i) {
			totalScore += score[i];
		}

		return totalScore / stuNum;
	}
}