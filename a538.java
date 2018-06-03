import java.math.BigInteger;
import java.util.Scanner;

public class a538 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger big17 = new BigInteger("17");
		while (scan.hasNext()) {
			BigInteger num = scan.nextBigInteger();
			if (num.equals(BigInteger.ZERO))
				break;
			else if (num.mod(big17).equals(BigInteger.ZERO)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		scan.close();
	}
}