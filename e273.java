import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e273 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String inp;
		while ((inp = br.readLine()) != null) {
			int n = Integer.valueOf(inp);
			String[] numStr = br.readLine().split(" ");
			int[] num = new int[n];
			for (int i = 0; i < n; i++) {
				num[i] = Integer.valueOf(numStr[i]);
			}

			if (n == 1) {
				pw.println(0);
				continue;
			}
			int m = 0;
			while (--n > 0) {
				pw.print(n * num[m] + " ");
				m++;
			}
			pw.println();
		}
		pw.close();
	}
}
