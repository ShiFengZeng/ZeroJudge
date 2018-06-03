import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d267 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nLine;

		while ((nLine = br.readLine()) != null) {
			int n = Integer.parseInt(nLine);

			for (int i = 0; i < n; ++i) {
				String str = br.readLine();
				int letter[] = new int[26];

				str = str.toLowerCase();
				for (int j = 0; j < str.length(); ++j) {
					if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z') {
						letter[str.charAt(j) - 'a']++;
					}
				}

				int max = 0;

				for (int k = 0; k < 26; ++k) {
					if (max < letter[k]) {
						max = letter[k];
					}
				}

				for (int k = 0; k < 26; ++k) {
					if (letter[k] == max) {
						System.out.print(String.format("%c",  (k + 'a')));
					}
				}
				System.out.println();
			}
		}

	}

}