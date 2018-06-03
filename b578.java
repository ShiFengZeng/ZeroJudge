import java.math.BigInteger;
import java.util.Scanner;

public class b578 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;
		BigInteger a, b, c;

		while (scan.hasNext()) {
			T = scan.nextInt();
			for (int i = 0; i < T; ++i) {
				a = scan.nextBigInteger();
				b = scan.nextBigInteger();
				c = scan.nextBigInteger();

				if (a.compareTo(b) > 0) {
					BigInteger temp = a;
					a = b;
					b = temp;
				}
				if (b.compareTo(c) > 0) {
					BigInteger temp = b;
					b = c;
					c = temp;
				}
				if (a.compareTo(b) > 0) {
					BigInteger temp = a;
					a = b;
					b = temp;
				}

				if (a.multiply(a).add(b.multiply(b)).compareTo(c.multiply(c)) > 0) {
					System.out.println("acute triangle");
				} else if (a.multiply(a).add(b.multiply(b)).compareTo(c.multiply(c)) < 0) {
					System.out.println("obtuse triangle");
				} else {
					System.out.println("right triangle");
				}
			}
		}
		scan.close();
	}
}