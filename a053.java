import java.util.Scanner;

public class a053 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			if (n >= 0 && n <= 10) {
				System.out.println(n * 6);
			} else if (n <= 20) {
				System.out.println((n - 10) * 2 + 10 * 6);
			} else if (n <= 40) {
				System.out.println((n - 20) * 1 + 10 * 2 + 10 * 6);
			} else if (n > 40) {
				System.out.println(100);
			}
		}
	}
}
