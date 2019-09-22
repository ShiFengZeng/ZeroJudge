import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b970 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int n = Integer.valueOf(br.readLine());

		for (int i = 1; i <= n; ++i) {
			pw.println(i + ". I don't say swear words!");
		}

		pw.close();
	}
}
