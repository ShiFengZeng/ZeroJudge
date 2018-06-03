import java.math.BigDecimal;
import java.util.Scanner;

public class d213 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			BigDecimal[] num = new BigDecimal[n + 1];
			num[0] = new BigDecimal("2");

			for (int i = 1; i <= n; ++i) {
				// num[i] = Math.pow(2, i + 1) + num[i - 1];
				num[i] = new BigDecimal(Math.pow(2, i + 1)).add(num[i - 1]);
				if (i >= 10) {
					// num[i] -= Math.pow(2, i - 9);
					num[i] = num[i].subtract(BigDecimal.valueOf(Math.pow(2, i - 9)));
				}
			}
			System.out.println(num[n].stripTrailingZeros().toPlainString());

		}
		scan.close();
	}
}