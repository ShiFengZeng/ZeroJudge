import java.util.Scanner;

public class a700 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			long[][] checkerBoard = new long[8][9];
			int powerOf = 0;
			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j <= 8; ++j) {
					checkerBoard[i][j] = (long) Math.pow(2, powerOf);
					powerOf++;
				}
			}
			System.out.println(checkerBoard[a][b]);
		}
	}
}
