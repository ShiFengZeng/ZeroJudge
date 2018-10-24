import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b415 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			String[] inp = line.split(" ");
			long x = Long.valueOf(inp[0]);
			long n = Long.valueOf(inp[1]);
			long m = Long.valueOf(inp[2]) - 1;

			pw.print(x);
			for (int i = 0; i < m; ++i) {
				x = (x * x) % n;
				pw.print(" " + x);
			}
			pw.println();
		}
		pw.close();
	}

}
