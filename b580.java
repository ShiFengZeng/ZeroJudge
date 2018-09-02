import java.io.PrintWriter;
import java.util.Scanner;

public class b580 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		while (scan.hasNext()) {
			int T = scan.nextInt();
			for (int i = 0; i < T; ++i) {
				int N = scan.nextInt();
				int a[][] = new int[N][N];
				int x = N / 2;
				int y = N / 2;

				a[x][y] = 1;
				y++;

				for (int j = 2, jj = 2; jj <= N * N; j += 2) {
					for (int k = 0; k < j; ++k) {
						a[x][y] = jj;
						x--;
						jj++;
					}
					x++;
					y--;

					for (int k = 0; k < j; ++k) {
						a[x][y] = jj;
						y--;
						jj++;
					}
					x++;
					y++;

					for (int k = 0; k < j; ++k) {
						a[x][y] = jj;
						x++;
						jj++;
					}
					x--;
					y++;

					for (int k = 0; k < j; ++k) {
						a[x][y] = jj;
						y++;
						jj++;
					}

				}

				for (int j = 0; j < N; ++j) {
					for (int k = 0; k < N; ++k) {
						pw.print(String.format("%5d", a[j][k]));
					}
					pw.println();
				}
			}
		}
		pw.close();
		scan.close();
	}
}
