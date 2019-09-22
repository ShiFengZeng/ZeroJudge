import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;

public class e196 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] inp = br.readLine().split(" ");
		int n = Integer.valueOf(inp[0]);
		// int m = Integer.valueOf(inp[1]);
		int[] p = new int[n + 1];

		String[] inp2 = br.readLine().split(" ");
		int len = inp2.length;
		int[] r = new int[len];
		for (int i = 0; i < len; ++i) {
			r[i] = Integer.valueOf(inp2[i]);
		}

		for (int i = 0; i < len; i++) {
			p[r[i]] += 1;
		}

		int c = 0;
		for (int i = 1; i < n + 1; i++) {
			if (p[i] != 2) {
				c++;
			}
		}
		pw.println(c);
		pw.close();
	}
}
