import java.util.Scanner;

public class b965 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			// R, C, M
			/*
			 * R 行(line)是 矩陣B 的 內容，每一行(line)都包含 C 個正整數，其中的第 i 行第 j 個數字代表 矩陣Bij 的值。
			 * 在矩陣內容後的一行有 M 個整數，表示對 矩陣A 進行的操作。
			 *
			 * mk = 0 則代表旋轉， mk = 1 則代表翻轉
			 */

			int R = scan.nextInt();
			int C = scan.nextInt();

			int M = scan.nextInt();
			int Range = Math.max(R, C);
			int[][] A = new int[Range][Range];
			int[][] B = new int[Range][Range];
			int[] mk = new int[M];
			
			for (int i = 0; i < R; ++i) {
				for (int j = 0; j < C; ++j) {
					A[i][j] = scan.nextInt();
				}
			}

			for (int i = 0; i < M; ++i) {
				mk[i] = scan.nextInt();

			}
			for (int i = M - 1; i >= 0; --i) {
				if (mk[i] == 0) {
					for (int j = C - 1; j >= 0; --j) {
						for (int k = 0; k < R; ++k) {
							B[C - j - 1][k] = A[k][j];
						}
					}

					for (int j = 0; j < C; ++j) {
						for (int k = 0; k < R; ++k) {
							A[j][k] = B[j][k];
						}
					}

					int temp = R;
					R = C;
					C = temp;
				} else {
					for (int j = R - 1; j >= 0; --j) {
						for (int k = 0; k < C; ++k) {
							B[R - j - 1][k] = A[j][k];
						}
					}

					for (int j = 0; j < R; ++j) {
						for (int k = 0; k < C; ++k) {
							A[j][k] = B[j][k];
						}
					}
				}
			}
			System.out.println(R + " " + C);
			for (int j = 0; j < R; ++j) {
				System.out.print(A[j][0]);
				for (int k = 1; k < C; ++k) {
					System.out.print(" " + A[j][k]);
				}
				System.out.println();
			}

		}
		scan.close();
	}
}