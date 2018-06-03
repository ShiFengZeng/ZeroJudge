import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class b115 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(new InputStreamReader(System.in));

		while (scan.hasNext()) {
			BigInteger a = new BigInteger(scan.next());
			String operator = scan.next();
			BigInteger b = new BigInteger(scan.next());

			switch (operator) {
			case "*":
				System.out.println(a.multiply(b));
				break;
			case "/":
				System.out.println(a.divide(b));
				break;
			}
		}
		scan.close();
	}
}
