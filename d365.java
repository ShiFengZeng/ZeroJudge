import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

public class d365 {
	static int W = 0, H = 0;
	static char Map[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			for (int i = 0; i < n; ++i) {
				String[] WHStr = br.readLine().split(" ");
				H = Integer.valueOf(WHStr[0]);
				W = Integer.valueOf(WHStr[1]);
				Map = new char[H][W];

				for (int j = 0; j < H; ++j) {
					String mapStrArr = br.readLine();
					for (int k = 0; k < W; ++k) {
						Map[j][k] = mapStrArr.charAt(k);
					}
				}

				TreeMap<Character, Integer> map = new TreeMap<>();
				int max = 0;
				for (int j = 0; j < H; ++j) {
					for (int k = 0; k < W; ++k) {
						if (Map[j][k] != '0') {
							if (map.containsKey(Map[j][k])) {
								int val = map.get(Map[j][k]) + 1;
								map.put(Map[j][k], val);
							} else {
								map.put(Map[j][k], 1);
							}
							dfs(j, k, Map[j][k]);
						}
					}
				}
				Collection<Integer> col = map.values();				
				max = Collections.max(col);
				pw.println("World #" + (i + 1));
				for (int m = max; m > 0; --m) {
					for (Character c : map.keySet()) {
						int val = map.get(c);
						if (val == m) {
							pw.println(c + ": " + m);
						}
					}
				}
			}
		}
		pw.close();
	}

	static void dfs(int x, int y, char c) {
		if (x < 0 || x >= H || y < 0 || y >= W || Map[x][y] != c)
			return;
		Map[x][y] = '0';
		dfs(x + 1, y, c);
		dfs(x, y + 1, c);
		dfs(x - 1, y, c);
		dfs(x, y - 1, c);
	}
}
