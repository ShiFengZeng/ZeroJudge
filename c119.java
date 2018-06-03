import java.math.BigInteger;
import java.util.Scanner;

public class c119 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			int n = scan.nextInt();
			BigInteger f = BigInteger.ONE;

			for (int i = 1; i <= n; ++i) {
				f = f.multiply(BigInteger.valueOf(i));
			}

			String s = f.toString();
			int sLen = s.length();
			long sum = 0;
			for (int i = 0; i < sLen; ++i) {
				sum += s.charAt(i) - '0';
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb);
		scan.close();
	}
}
