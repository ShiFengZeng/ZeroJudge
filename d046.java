import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d046 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int n = Integer.valueOf(br.readLine());
		String[] wStr = br.readLine().split(" ");
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (Integer.valueOf(wStr[i]) <= 10) {
				c += 1;
			}
		}
		pw.print(c);
		pw.close();
	}
}
