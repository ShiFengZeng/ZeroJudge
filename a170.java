import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class a170 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		String a, b;

		long sum;
		String hex;

		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			n = Integer.valueOf(line);

			for (int i = 0; i < n; ++i) {
				String[] inp = br.readLine().split(" ");
				a = inp[0];
				b = inp[1];

				sum = Integer.valueOf(a, 8) + Integer.valueOf(b, 8);

				hex = Long.toHexString(sum);
				hex = hex.toUpperCase();
				pw.println(hex);

			}

		}
		pw.close();
	}
}