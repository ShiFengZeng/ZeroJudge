import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d626 {
	static char[][] MAP;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			MAP = new char[n][n];
			for (int i = 0; i < n; ++i) {
				String inp = br.readLine();
				for (int j = 0; j < n; ++j) {
					MAP[i][j] = inp.charAt(j);
				}
			}

			String[] xy = br.readLine().split(" ");
			int x = Integer.valueOf(xy[0]);
			int y = Integer.valueOf(xy[1]);

			dfs(x, y);
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					pw.print(MAP[i][j]);
				}
				pw.println();
			}
		}
		pw.close();
	}

	static void dfs(int x, int y) {
		if (x < 0 || x == MAP[0].length || y < 0 || y == MAP[0].length)
			return;
		if (MAP[x][y] == '+')
			return;
		MAP[x][y] = '+';
		dfs(x, y - 1);
		dfs(x + 1, y);
		dfs(x, y + 1);
		dfs(x - 1, y);
	}

}
