import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class a465 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int T = Integer.valueOf(br.readLine());

		for (int i = 1; i <= T; ++i) {
			br.readLine();
			String A = br.readLine();

			int index = 0;
			int ans = 0;
			int len = A.length();

			while (index < len) {
				if (A.charAt(index) == '.') {
					ans++;
					index += 3;
				} else {
					index++;
				}
			}

			pw.println("Case " + i + ": " + ans);
		}

		pw.close();
	}
}
