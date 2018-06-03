import java.math.BigInteger;
import java.util.Scanner;

public class d142 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				BigInteger num = scan.nextBigInteger();
				System.out.println(sqrt(num));
			}
		}
		scan.close();
	}

	static BigInteger sqrt(BigInteger n) {
		BigInteger Two = new BigInteger("2");

		BigInteger Upper = n;
		BigInteger Lower = BigInteger.ZERO;
		BigInteger X = Upper;

		while (((Upper.subtract(Lower)).abs().compareTo(BigInteger.valueOf((long) 0.000001)))> 0) {
			BigInteger Mid = Lower.add(Upper).divide(Two);
			if ((Mid.multiply(Mid).subtract(X)).compareTo(BigInteger.ZERO) <= 0) {
				Lower = Mid;
			} else {
				Upper = Mid;
			}
		}
		BigInteger result = Upper;

		return result;
	}
}
