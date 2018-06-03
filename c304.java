import java.math.BigInteger;
import java.util.Scanner;

public class c304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger bi = new BigInteger("0");

		while (scan.hasNext()) {
			bi = scan.nextBigInteger();
			BigInteger res = new BigInteger("0");
			BigInteger original = bi;

			while (bi.signum() == 1) {
				res = res.multiply(new BigInteger("10"));
				res = res.add(bi.mod(new BigInteger("10")));
				bi = bi.divide(new BigInteger("10"));
			}

			System.out.println(original.add(res));
		}
		scan.close();
	}
}