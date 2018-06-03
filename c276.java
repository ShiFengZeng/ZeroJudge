import java.util.Scanner;

public class c276 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String ans = scan.nextLine();
			int n = scan.nextInt();
			String guess = scan.nextLine();

			for (int i = 0; i < n; ++i) {
				guess = scan.nextLine();
				System.out.println(nAnB(ans, guess));
			}
		}
	}

	public static String nAnB(String ans, String guess) {
		String result = "";
		int a = 0;
		int b = 0;

		for (int i = 0; i < ans.length(); ++i) {
			for (int j = 0; j < guess.length(); ++j) {
				if (ans.charAt(i) - '0' == guess.charAt(j) - '0') {
					b++;
				}
			}
			if (ans.charAt(i) - '0' == guess.charAt(i) - '0') {
				a++;
			}
		}
		b = b - a;
		result = a + "A" + b + "B";

		return result;
	}
}