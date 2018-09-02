import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class b964 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			String[] inpStr = br.readLine().split(" ");
			int[] inp = new int[n];

			for (int i = 0; i < n; ++i) {
				inp[i] = Integer.valueOf(inpStr[i]);
			}
			Arrays.sort(inp);

			int minScore = -1;
			for (int i = 0; i < n; ++i) {
				if (inp[i] >= 0 && inp[i] < 60) {
					minScore = inp[i];
				} else {
					break;
				}
			}
			int maxScore = 101;
			for (int i = n - 1; i >= 0; --i) {
				if (inp[i] <= 100 && inp[i] >= 60) {
					maxScore = inp[i];
				} else {
					break;
				}
			}

			pw.print(inp[0]);
			for (int i = 1; i < n; ++i) {
				pw.print(" " + inp[i]);
			}
			pw.println();
			if (minScore == -1) {
				pw.println("best case");
			} else {
				pw.println(minScore);
			}
			if (maxScore == 101) {
				pw.println("worst case");
			} else {
				pw.println(maxScore);
			}
		}
		pw.close();
	}

}