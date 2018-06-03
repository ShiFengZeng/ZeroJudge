import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.Arrays;

public class a291 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ans = new int[4];
		int n;
		int[] guess = new int[4];
		String str;
		// while (scan.hasNext()) {
		while ((str = br.readLine()) != null) {
			// str = scan.nextLine();
			String[] an = str.split(" ");
			for (int i = 0; i < 4; ++i) {
				// ans[i] = scan.nextInt();
				ans[i] = Integer.parseInt(an[i]);
			}
			StringBuilder sb = new StringBuilder();
			// n = Integer.parseInt(scan.nextLine());
			n = Integer.parseInt(br.readLine());

			// str = scan.nextLine();
			for (int i = 0; i < n; ++i) {
				// str = scan.nextLine();
				str = br.readLine();
				String[] s = str.split(" ");
				guess[0] = Integer.parseInt(s[0]);
				guess[1] = Integer.parseInt(s[1]);
				guess[2] = Integer.parseInt(s[2]);
				guess[3] = Integer.parseInt(s[3]);
				// guess[0] = scan.nextInt();
				// guess[1] = scan.nextInt();
				// guess[2] = scan.nextInt();
				// guess[3] = scan.nextInt();

				boolean[] isCorrect = new boolean[4];
				int a = 0, b = 0;
				for (int j = 0; j < 4; ++j) {
					if (ans[j] == guess[j]) {
						a++;
						isCorrect[j] = true;
					}
				}

				boolean[] isCompare = Arrays.copyOf(isCorrect, isCorrect.length);
				for (int j = 0; j < 4; ++j) {
					if (!isCorrect[j]) {
						for (int k = 0; k < 4; ++k) {
							if (!isCompare[k] && ans[j] == guess[k] && j != k) {
								b++;
								isCompare[k] = true;
								break;
							}
						}
					}
				}

				sb.append(a + "A" + b + "B\n");

			}
			System.out.println(sb);
		}
		// scan.close();
	}
}