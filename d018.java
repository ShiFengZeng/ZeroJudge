import java.math.BigDecimal;
import java.util.Scanner;

public class d018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			str = scan.nextLine();
			Scanner inputString = new Scanner(str).useDelimiter("[: ]");

			BigDecimal oddSum = new BigDecimal("0");
			BigDecimal evenSum = new BigDecimal("0");

			BigDecimal difference = new BigDecimal("0");
			while (inputString.hasNext()) {
				int serialNum = inputString.nextInt();
				BigDecimal realNum = inputString.nextBigDecimal();

				if (serialNum % 2 == 1) {
					oddSum = oddSum.add(realNum);
				} else {
					evenSum = evenSum.add(realNum);
				}
			}
			difference = oddSum.subtract(evenSum);
			System.out.println(difference.stripTrailingZeros().toPlainString());
		}

		scan.close();
	}
}