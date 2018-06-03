import java.math.BigInteger;
import java.util.Scanner;

public class d134 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, m;

		while (scan.hasNext()) {
			n = scan.nextInt();
			m = scan.nextInt();
			if (n == 0 && m == 0)
				break;

			System.out.printf("%d things taken %d at a time is %s exactly.\n", n, m, combination(n, m));
		}
		scan.close();
	}

	static BigInteger combination(long n, long k) {
		BigInteger result = BigInteger.ONE;

		for (long i = n; i > Math.max(n - k, k); --i) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		for (long j = Math.min(n - k, k); j > 1; --j) {
			result = result.divide(BigInteger.valueOf(j));
		}

		return result;
	}
}