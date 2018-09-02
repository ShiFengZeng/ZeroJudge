import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d787 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);

			for (int i = 0; i < n; ++i) {
				String[] temp = br.readLine().split(" ");

				int carryCount = 0;
				int carry = 0;
				for (int ii = temp[0].length() - 1, jj = temp[1].length() - 1; ii >= 0 && jj >= 0; --ii, --jj) {
					int add = (temp[0].charAt(ii) - '0') + (temp[1].charAt(jj) - '0') + carry;
					if (add >= 10) {
						carry = 1;
						carryCount++;
					} else {
						carry = 0;
					}
				}
				pw.println(carryCount);
			}
		}
		pw.close();
	}

}