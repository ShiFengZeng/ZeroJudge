import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e169 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String input;

		while ((input = br.readLine()) != null) {
			int n = Integer.valueOf(input);
			if (n == 0)
				break;

			String[] scoresStr = br.readLine().split(" ");
			int len = scoresStr.length;
			int[] scores = new int[len];

			for (int i = 0; i < len; ++i) {
				scores[i] = Integer.valueOf(scoresStr[i]);
			}
			int[] s = new int[100];

			for (int i : scores) {
				s[i % 100] += 1;
			}

			int total = (s[0] * (s[0] - 1) / 2) + (s[50] * (s[50] - 1) / 2);

			for (int i = 1; i < 50; ++i) {
				total += s[i] * s[100 - i];
			}

			pw.println(total);
		}
		pw.close();
	}
}