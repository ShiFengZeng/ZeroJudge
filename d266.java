import java.math.BigInteger;
import java.util.Scanner;

public class d266 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			BigInteger rice = new BigInteger("2").pow(n).subtract(new BigInteger("1"));
			System.out.println(rice);
		}
		scan.close();
	}
}