import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d625 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nLine;
		while ((nLine = br.readLine()) != null) {
			int n = Integer.parseInt(nLine);

			char[][] mines = new char[n][n];
			int[][] minesCount = new int[n][n];
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < n; ++i) {
				String iLine = br.readLine();
				for (int j = 0; j < iLine.length(); ++j) {
					mines[i][j] = iLine.charAt(j);
				}
			}

			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (mines[i][j] == '*') {

						for (int ii = -1; ii <= 1; ++ii) {
							for (int jj = -1; jj <= 1; ++jj) {
								if (i + ii >= 0 && i + ii < n && j + jj >= 0 && j + jj < n) {
									minesCount[i + ii][j + jj]++;
								}
							}
						}

					}
				}
			}

			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (mines[i][j] == '*') {
						sb.append("*");
					} else if (minesCount[i][j] == 0) {
						sb.append("-");
					} else {
						sb.append(minesCount[i][j]);
					}
				}
				sb.append("\n");
			}
			System.out.println(sb);
		}
	}
}