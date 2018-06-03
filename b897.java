import java.util.Scanner;

public class b897 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n, k;

		while (scan.hasNext()) {
			n = scan.nextLong();
			k = scan.nextLong();
			
			System.out.println(combination(n, k));
		}
		scan.close();
	}

	public static long combination(long n, long k) {
		double result = 0;

		for (long i = n; i > Math.max(n - k, k); --i) {
			result += Math.log10(i);
		}

		for (long j = Math.min(n - k, k); j > 1; --j) {
			result -= Math.log10(j);
		}

		return (long) (result + 1);
	}
}