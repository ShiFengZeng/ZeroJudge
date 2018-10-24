import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;

		char[][] name = new char[16][1000];
		int i = 0;
		int maxLength = 0;

		while ((str = br.readLine()) != null) {

			if (!str.equals("END")) {
				for (int j = 0; j < str.length(); ++j) {
					name[i][j] = str.charAt(j);
				}
				if (maxLength < str.length()) {
					maxLength = str.length();
				}
				i++;
			}

			else {
				for (int k = 0; k < maxLength; k++) {
					// for (int j = 0; j < i; ++j) {
					// System.out.print(String.format("%3s", name[j][k]));
					// }
					// System.out.println();

					for (int j = 0; j < i; ++j) {
						if (j >= name[j].length)
							System.out.print("   ");
						else
							System.out.print(String.format("%c  ", name[j][k]));
					}
					System.out.println();

				}

			}
		}

	}
}