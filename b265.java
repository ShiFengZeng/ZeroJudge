import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

public class b265 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			if (n == 0) {
				break;
			}
			int[][] curriculumModular = new int[n][5];
			for (int i = 0; i < n; ++i) {
				String[] inp = br.readLine().split(" ");
				for (int j = 0; j < 5; ++j) {
					curriculumModular[i][j] = Integer.valueOf(inp[j]);
				}
			}

			for (int i = 0; i < n; ++i) {
				Arrays.sort(curriculumModular[i]);
			}

			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < n; ++i) {
				String modular = "";
				for (int j = 0; j < 5; ++j) {
					modular += curriculumModular[i][j];
				}
				if (!map.containsKey(modular)) {
					map.put(modular, 1);
				} else {
					map.put(modular, map.get(modular) + 1);
				}
			}
			int max = 0;
			for (String s : map.keySet()) {
				if (map.get(s) > max) {
					max = map.get(s);
				}
			}
			int count = 0;
			for (String s : map.keySet()) {
				if (map.get(s) == max) {
					count++;
				}
			}
			pw.println(max * count);
		}
		pw.close();
	}

}
