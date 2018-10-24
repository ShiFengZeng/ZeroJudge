import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class a227 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			int N = Integer.valueOf(line);
			move(N, 'A', 'B', 'C');
		}
		pw.close();
	}

	static PrintWriter pw = new PrintWriter(System.out);

	static void move(int n, char a, char b, char c) {
		if (n == 1) {
			pw.println(String.format("Move ring %d from %s to %s", n, a, c));
		} else {
			move(n - 1, a, c, b);
			pw.println(String.format("Move ring %d from %s to %s", n, a, c));
			move(n - 1, b, a, c);
		}
	}
}
