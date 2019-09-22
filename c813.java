import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			if (n == 0)
				break;

			while (n >= 10) {
				n = f(n);
			}
			pw.println(n);
		}
		pw.close();
	}

	static int f(int n) {
		int res = 0;
		while (n > 0) {
			res += n % 10;
			n /= 10;
		}
		return res;
	}
}
