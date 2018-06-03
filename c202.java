import java.util.Scanner;

public class c202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			long[] a = new long[n];

			for (int i = 0; i < n; ++i) {
				a[i] = scan.nextLong();
			}
			System.out.println(mulGcd(a));
		}
		scan.close();
	}

	public static long mulGcd(long[] input) {

		for (int i = 0; i < input.length - 1; ++i) {
			input[i + 1] = gcd(input[i], input[i + 1]);
		}

		return input[input.length - 1];
	}

	public static long gcd(long a, long b) {

		while (b > 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}