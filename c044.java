import java.util.Scanner;

public class c044 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] letter = new int[26];
		while (scan.hasNext()) {
			n = scan.nextInt();

			String str = scan.nextLine();
			for (int i = 0; i < n; ++i) {
				str = scan.nextLine();

				str = str.toUpperCase();
				for (int j = 0; j < str.length(); ++j) {
					if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
						letter[str.charAt(j) - 'A']++;
					}
				}
			}
			

			int max = 0;
			for (int k = 0; k <= 25; ++k) {
				if (letter[k] > max) {
					max = letter[k];
				}
			}

			for (int i = max; i > 0; --i) {
				for (int j = 0; j <= 25; ++j) {
					if (letter[j] == i) {
						System.out.println(String.format("%c %d", j + 'A', i));
					}
				}
			}
		}

		scan.close();
	}
}