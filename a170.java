import java.util.Scanner;

public class a170 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String a, b;

		long sum;
		String hex;

		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				a = scan.next();
				b = scan.next();

				sum = Integer.valueOf(a, 8) + Integer.valueOf(b, 8);

				hex = Long.toHexString(sum);
				hex = hex.toUpperCase();
				System.out.println(hex);

			}

		}
		scan.close();
	}
}