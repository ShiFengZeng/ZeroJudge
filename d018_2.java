import java.math.BigDecimal;
import java.util.Scanner;

public class d018_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			str = scan.nextLine();

			String[] s = str.split("[: ]");

			BigDecimal oddSum = new BigDecimal("0");
			BigDecimal evenSum = new BigDecimal("0");

			BigDecimal difference = new BigDecimal("0");

			BigDecimal realNum = new BigDecimal("0");
			for (int i = 0; i < s.length; i += 2) {
				if (Integer.valueOf(s[i]) % 2 == 1) {
					realNum = new BigDecimal(s[i + 1]);
					oddSum = oddSum.add(realNum);
				} else {
					realNum = new BigDecimal(s[i + 1]);
					evenSum = evenSum.add(realNum);
				}
			}

			difference = oddSum.subtract(evenSum);
			System.out.println(difference.stripTrailingZeros().toPlainString());
		}

		scan.close();
	}
}