import java.util.Scanner;

public class a621 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i <= n; ++i) {
				System.out.println(String.format("2^%d = %.0f", i, Math.pow(2, i)));
			}
		}
		scan.close();
	}
}