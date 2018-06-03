import java.math.BigInteger;
import java.util.Scanner;

public class c034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			BigInteger num = scan.nextBigInteger();
			BigInteger num2;

			while (!(num2 = scan.nextBigInteger()).equals(BigInteger.ZERO)) {
				num = num.add(num2);
			}
			System.out.println(num);
		}
		scan.close();
	}
}