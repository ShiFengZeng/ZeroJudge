import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int t = Integer.valueOf(br.readLine());

		for (int i = 0; i < t; ++i) {
			int count = 0;
			String[] temp = br.readLine().split(" ");
			int n = Integer.valueOf(temp[0]);
			int m = Integer.valueOf(temp[1]);

			while (n > 1) {
				n = n - m + 1;
				count += 1;
			}

			if (n == 1) {
				pw.println(count);
			} else {
				pw.println("cannot do this");
			}
		}
		pw.close();
	}
}
