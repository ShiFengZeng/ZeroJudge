import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d124_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while ((line = br.readLine()) != null) {

			int sum = 0;

			for (int i = 0; i < line.length(); ++i) {
				// if (str.charAt(i) == '-') {
				// continue;
				// }
				sum += line.charAt(i) - '0';
			}
			System.out.println(sum % 3 == 0 ? "yes" : "no");
		}
	}
}
