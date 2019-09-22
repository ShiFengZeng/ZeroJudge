import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		while ((line = br.readLine()) != null) {
			int len = line.length();
			String[] inp = br.readLine().split(" ");
			int[] order = new int[len];
			for (int i = 0; i < len; ++i) {
				order[i] = Integer.valueOf(inp[i]);
			}
			char[] res = new char[len];

			for (int i = 0; i < len; ++i) {
				res[(order[i] - 1)] = line.charAt(i);
			}

			for (int i = 0; i < len; ++i) {
				pw.print(res[i]);
			}
			pw.println();
		}
		pw.close();
	}
}
