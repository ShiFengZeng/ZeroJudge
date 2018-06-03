import java.util.Scanner;

public class d980 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		long a, b, c;

		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = -0; i < n; ++i) {
				String triangleType = "Scalene";
				a = scan.nextLong();
				b = scan.nextLong();
				c = scan.nextLong();

				if (a > b) {
					long temp = a;
					a = b;
					b = temp;
				}
				if (b > c) {
					long temp = b;
					b = c;
					c = temp;
				}
				if (a > b) {
					long temp = a;
					a = b;
					b = temp;
				}

				if (a + b <= c || a <= 0 || b <= 0 || c <= 0) {
					triangleType = "Invalid";
				} else if (a == b && b == c) {
					triangleType = "Equilateral";
				} else if (a == b || b == c) {
					triangleType = "Isosceles";
				}

				System.out.println(String.format("Case %d: %s", i + 1, triangleType));
			}
		}
		scan.close();
	}
}