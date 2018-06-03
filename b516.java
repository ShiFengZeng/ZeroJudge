import java.util.Scanner;

public class b516 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				String str = scan.next();

				for (int j = 0; j < str.length(); ++j) {
					System.out.print((char) (str.charAt(j) + 3) > 'Z' ? (char) (str.charAt(j) + 3 - 26)
							: (char) (str.charAt(j) + 3));
				}
				System.out.println();
			}
		}
	}
}
