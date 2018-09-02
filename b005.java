import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			int[][] array = new int[n][n];

			for (int i = 0; i < n; ++i) {
				String[] inpTemp = br.readLine().split(" ");
				for (int j = 0; j < n; ++j) {
					array[i][j] = Integer.valueOf(inpTemp[j]);
				}
			}

			int rowCount = 0;
			int colCount = 0;
			int rowTarget = 0;
			int colTarget = 0;
			for (int i = 0; i < n; ++i) {
				int row = 0;
				int col = 0;

				for (int j = 0; j < n; ++j) {
					row ^= array[i][j];
					col ^= array[j][i];
				}
				if (row == 1) {
					rowTarget = i;
					rowCount++;
				}
				if (col == 1) {
					colTarget = i;
					colCount++;
				}
			}

			if (rowCount == 0 && colCount == 0) {
				pw.println("OK");
			} else if (rowCount == 1 && colCount == 1) {
				pw.println(String.format("Change bit (%d,%d)", rowTarget + 1, colTarget + 1));
			} else {
				pw.println("Corrupt");
			}
		}
		pw.close();
	}
}
