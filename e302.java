import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String inp;
		while ((inp = br.readLine()) != null) {
			int n = Integer.valueOf(inp);
			for (int i = 0; i < n; ++i) {
				pw.println(cal(br.readLine()) ? "YES" : "NO");
			}
		}
		pw.close();
	}

	static boolean cal(String input) {
		int len = input.length();
		int c = 0;
		for (int i = 0; i < len; ++i) {
			if (c < 0) {
				return false;
			}
			if (input.charAt(i) == 'Y') {
				c++;
			} else {
				c--;
			}
		}
		if (c == 0) {
			return true;

		} else {
			return false;
		}
	}
}
