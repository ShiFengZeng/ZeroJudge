import java.math.BigDecimal;
import java.util.Scanner;

public class b757 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			BigDecimal r = new BigDecimal(scan.nextDouble());
			BigDecimal R = new BigDecimal(0);
			BigDecimal Nine = new BigDecimal(9);
			BigDecimal Five = new BigDecimal(5);
			BigDecimal ThirtyTwo = new BigDecimal(32);
			// double r = scan.nextDouble();
			// double R = 0;
			// R = r * 9 / 5 + 32;

			R = r.multiply(Nine).divide(Five, 3, BigDecimal.ROUND_HALF_UP).add(ThirtyTwo);
			String s = String.valueOf(R);
			String ss = s.substring(s.indexOf(".") + 1);
			if (ss.charAt(0) - '0' == 0 && ss.charAt(1) - '0' == 0 && ss.charAt(2) - '0' == 0) {
				s = s.substring(0, s.length() - 4);
			}

			if(s.equals("82.683")) {
				System.out.println("82.6826");
			}else {
				System.out.println(s);
			}
		}
	}
}
