import java.math.BigInteger;

public class d506 {
	public static void main(String[] args) {
		String b = Integer.toBinaryString(86495);
		int c = 1;
		BigInteger sum = BigInteger.ONE;
		for (int i = b.length() - 1; i >= 0; --i) {
			if (b.charAt(i) == '1') {
				sum = sum.multiply(new BigInteger("7").pow(c));
			}
			c *= 2;
		}
		System.out.println(sum);
	}

}
