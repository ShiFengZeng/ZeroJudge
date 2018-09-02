import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d336 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int t = Integer.valueOf(line);

			for (int i = 0; i < t; ++i) {
				int oddSum = 0;
				int evenSum = 0;

				String inp = br.readLine();

				for (int j = 0; j < inp.length(); j += 2) {
					if (inp.charAt(j) == '1') {
						oddSum++;
					}
				}
				for (int j = 1; j < inp.length(); j += 2) {
					if (inp.charAt(j) == '1') {
						evenSum++;
					}
				}
				if ((oddSum + evenSum * 2) % 3 == 0 || (evenSum + oddSum * 2) % 3 == 0) {
					pw.println("Yes");
				} else {
					pw.println("No");
				}
			}
		}
		pw.close();
	}
}