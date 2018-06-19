import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class d561 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			BigDecimal bd = scan.nextBigDecimal();
			System.out.println(bd.setScale(2, RoundingMode.HALF_UP));
		}
		scan.close();
	}
}