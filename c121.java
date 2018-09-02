import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class c121 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		BigInteger[] bigInt = new BigInteger[5001];
		BigInteger big0 = BigInteger.ZERO;
		BigInteger big1 = BigInteger.ONE;
		bigInt[0] = big0;
		bigInt[1] = big1;
		for (int i = 2; i <= 5000; ++i) {
			bigInt[i] = bigInt[i - 1].add(bigInt[i - 2]);
		}
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			System.out.println(String.format("The Fibonacci number for %d is %d", n, bigInt[n]));
		}

	}
}