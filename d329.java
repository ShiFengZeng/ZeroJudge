import java.math.BigInteger;
import java.util.Scanner;

public class d329 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			int N = scan.nextInt();

			for (int i = 0; i < N; ++i) {
				BigInteger num1 = scan.nextBigInteger();
				BigInteger num2 = scan.nextBigInteger();

				BigInteger add = reserve(num1).add(reserve(num2));

				sb.append(reserve(add) + "\n");
			}
			System.out.println(sb);
		}
		scan.close();
	}

	static BigInteger reserve(BigInteger num) {
		BigInteger result = BigInteger.ZERO;

		while (num.compareTo(BigInteger.ZERO) > 0) {
			result = result.multiply(BigInteger.TEN);
			result = result.add(num.mod(BigInteger.TEN));
			num = num.divide(BigInteger.TEN);
		}

		return result;
	}
}