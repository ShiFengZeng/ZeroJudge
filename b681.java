import java.util.Scanner;

public class b681 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			long n = scan.nextLong();

			System.out.println(n > 0 ? 2 * n - 1 : -2 * n);
		}
	}
}
