import java.util.Scanner;

public class a022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.nextLine();
			char[] c = str.toCharArray();
			boolean isPalindromes = true;

			for (int i = 0; i <= c.length / 2; ++i) {
				if (c[i] != c[c.length - 1 - i]) {
					isPalindromes = false;
				}
			}
			if (!isPalindromes) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
	}
}
