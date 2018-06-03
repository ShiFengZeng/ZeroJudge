import java.util.Scanner;

public class a867 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str;
		while (scan.hasNext()) {

			char[][] mines = new char[15][30];
			int[][] minesCount = new int[15][30];
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < 15; ++i) {
				str = scan.nextLine();
				for (int j = 0; j < 30; ++j) {
					mines[i][j] = str.charAt(j);
				}
			}

			for (int i = 0; i < 15; ++i) {
				for (int j = 0; j < 30; ++j) {
					if (mines[i][j] == '*') {

						for (int ii = -1; ii <= 1; ++ii) {
							for (int jj = -1; jj <= 1; ++jj) {
								if (i + ii >= 0 && i + ii < 15 && j + jj >= 0 && j + jj < 30) {
									minesCount[i + ii][j + jj]++;
								}
							}
						}

					}
				}
			}

			for (int i = 0; i < 15; ++i) {
				for (int j = 0; j < 30; ++j) {
					if (mines[i][j] == '*') {
						sb.append("*");
					} else if (minesCount[i][j] == 0) {
						sb.append(".");
					} else {
						sb.append(minesCount[i][j]);
					}
				}
				sb.append("\n");
			}
			System.out.println(sb);
		}
		scan.close();
	}
}