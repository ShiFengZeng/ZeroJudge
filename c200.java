import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class c200 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		for (int i = 0; i < T; ++i) {
			String inp = br.readLine();
			int len = inp.length();
			BigInteger c = BigInteger.ONE;
			BigInteger n = BigInteger.ZERO;
			BigInteger total = BigInteger.ZERO;
			for (int j = len - 1; j >= 0; --j) {
				if (Character.isLetter(inp.charAt(j))) {
					Character.toUpperCase(inp.charAt(j));
					n = BigInteger.valueOf(inp.charAt(j) - 'A' + 10);
				} else {
					n = BigInteger.valueOf(Character.getNumericValue(inp.charAt(j)));
				}
				BigInteger b = c.multiply(n);
				total = total.add(b);
				c = c.multiply(new BigInteger("36"));
			}
			System.out.println(total.mod(new BigInteger("1688")).add(BigInteger.ONE));
		}
	}
}
