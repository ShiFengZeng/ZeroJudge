import java.math.BigInteger;
import java.util.Scanner;

public class c311 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger n;

		while (scan.hasNext()) {
			n = scan.nextBigInteger();

			System.out.println(n.mod(new BigInteger("91")));
		}
		scan.close();
	}
}