import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		int[] c = new int[] { 1, 0, 0, 0, 0, 0, 1, 0, 2, 1 };

		while ((line = br.readLine()) != null) {
			int len = line.length();
			int count = 0;
			for (int i = 0; i < len; ++i) {
				count += c[line.charAt(i) - '0'];
			}
			pw.println(count);
		}
		pw.close();
	}
}
