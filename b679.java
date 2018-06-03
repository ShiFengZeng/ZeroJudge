import java.math.BigInteger;
import java.util.Scanner;

public class b679 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.nextLine();
			BigInteger X = new BigInteger(str);
			BigInteger H = new BigInteger("0");

			if (X.equals(BigInteger.ZERO)) {
				System.out.println(H);
				break;
			}
			for (BigInteger i = bigIntSqRootFloor(X.multiply(new BigInteger("2")));; i = i.add(BigInteger.ONE)) {
				if (X.equals((i.add(BigInteger.ONE)).multiply(i).divide(new BigInteger("2")))) {
					H = i;
					System.out.println(i);
					break;
				}
			}
		}
	}

	public static BigInteger bigIntSqRootFloor(BigInteger x) throws IllegalArgumentException {
		if (x.compareTo(BigInteger.ZERO) < 0) {
			throw new IllegalArgumentException("Negative argument.");
		}
		// square roots of 0 and 1 are trivial and
		// y == 0 will cause a divide-by-zero exception
		if (x.equals(BigInteger.ZERO) || x.equals(BigInteger.ONE)) {
			return x;
		} // end if
		BigInteger two = BigInteger.valueOf(2L);
		BigInteger y;
		// starting with y = x / 2 avoids magnitude issues with x squared
		for (y = x.divide(two); y.compareTo(x.divide(y)) > 0; y = ((x.divide(y)).add(y)).divide(two))
			;
		return y;
	} // end bigIntSqRootFloor
}
