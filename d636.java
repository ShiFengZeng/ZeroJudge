import java.math.BigInteger;
import java.util.Scanner;

public class d636 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			BigInteger a = new BigInteger(scan.next());
			BigInteger b = new BigInteger(scan.next());
			BigInteger res = BigInteger.ONE;
			res = a.modPow(b, new BigInteger("10007"));
			sb.append(res);
		}
		System.out.println(sb);
		scan.close();
	}
}