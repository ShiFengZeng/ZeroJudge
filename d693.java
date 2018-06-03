import java.util.Scanner;

public class d693 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			long[] a = new long[n];
			if (n == 0)
				break;

			for (int i = 0; i < n; ++i) {
				a[i] = scan.nextLong();
			}
			System.out.println(lcm(a));
		}
		scan.close();
	}

	public static long gcd(long a, long b) {
		while (b > 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	public static long gcd(long[] input) {
		for (int i = 0; i < input.length - 1; ++i) {
			input[i + 1] = gcd(input[i], input[i + 1]);
		}

		return input[input.length - 1];
	}

	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	public static long lcm(long[] input) {
		for (int i = 0; i < input.length - 1; ++i) {
			input[i + 1] = lcm(input[i], input[i + 1]);
		}
		return input[input.length - 1];
	}
}