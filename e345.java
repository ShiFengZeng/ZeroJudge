import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e345 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String inp;
		while ((inp = br.readLine()) != null) {
			int n = Integer.valueOf(inp);
			pw.println((n - 1) % 9 + 1);
		}
		pw.close();
	}
}
