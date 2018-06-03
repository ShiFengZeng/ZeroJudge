import java.math.BigInteger;
import java.util.Scanner;

public class d614 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			String str = scan.nextLine();
			
			for (int i = 0; i < n; ++i) {
				str = scan.nextLine();

				String[] s = str.split(" \\+ ");
				BigInteger bigInt = new BigInteger("0");

				for (String tempStr : s) {
					bigInt = bigInt.add(new BigInteger(tempStr));
				}
				System.out.println(bigInt);
			}
		}
	}
}
