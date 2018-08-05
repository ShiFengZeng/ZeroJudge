import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			line = line.toLowerCase();
			int lineLen = line.length();

			System.out.println(line.toUpperCase().charAt(0) + line.substring(1, lineLen));
			for (int i = 1; i < lineLen; ++i) {
				if(line.charAt(i)==' ')
					continue;
				System.out
						.println(line.substring(0, i) + line.toUpperCase().charAt(i) + line.substring(i + 1, lineLen));
			}
		}
	}
}