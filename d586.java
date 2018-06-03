import java.util.Arrays;
import java.util.Scanner;

public class d586 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numberToLetter = new String[] { "m", "j", "q", "h", "o", "f", "a", "w", "c", "p", "n", "s", "e", "x",
				"d", "k", "v", "g", "t", "z", "b", "l", "r", "y", "u", "i" };
		String[] letterToNumber = new String[] { "u", "z", "r", "m", "a", "t", "i", "f", "x", "o", "p", "n", "h", "w",
				"v", "b", "s", "l", "e", "k", "y", "c", "q", "j", "g", "d" };
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < n; ++i) {
				int m = scan.nextInt();
				String[] input = new String[m];
				for (int j = 0; j < m; ++j) {
					input[j] = scan.next();
				}
				if (input[0].matches("[a-z]")) {
					int sum = 0;
					for (int j = 0; j < m; ++j) {
						sum += (Arrays.asList(letterToNumber).indexOf(input[j]) + 1);
					}
					sb.append(sum + "\n");
				} else {
					for (int j = 0; j < m; ++j) {
						sb.append(numberToLetter[Integer.valueOf(input[j]) - 1]);
					}
					sb.append("\n");
				}
			}
			System.out.print(sb);
		}
		scan.close();
	}
}