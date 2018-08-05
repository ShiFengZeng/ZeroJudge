import java.math.BigInteger;
import java.util.Scanner;

public class d764 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger bi;
		while (scan.hasNext()) {
			bi = scan.nextBigInteger();
			if (bi.equals(BigInteger.ZERO))
				break;
			else {
				bi = sqrt(bi);
				System.out.println(bi.multiply(bi));
			}
		}
		scan.close();
	}

	public static BigInteger sqrt(BigInteger x) {
		BigInteger div = BigInteger.ZERO.setBit(x.bitLength() / 2);
		BigInteger div2 = div;
		// Loop until we hit the same value twice in a row, or wind
		// up alternating.
		for (;;) {
			BigInteger y = div.add(x.divide(div)).shiftRight(1);
			if (y.equals(div) || y.equals(div2))
				return y;
			div2 = div;
			div = y;
		}
	}
}
