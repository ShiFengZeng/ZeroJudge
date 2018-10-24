import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class c731 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();

		int n = Integer.valueOf(line);

		BigInteger[] up = new BigInteger[n + 1];
		BigInteger[] left = new BigInteger[n + 1];
		BigInteger[] right = new BigInteger[n + 1];
		BigInteger big1 = BigInteger.ONE;

		up[1] = big1;
		left[1] = big1;
		right[1] = big1;
		for (int i = 2; i <= n; ++i) {
			up[i] = up[i - 1].add(left[i - 1]).add(right[i - 1]);
			left[i] = up[i - 1].add(left[i - 1]);
			right[i] = up[i - 1].add(right[i - 1]);
		}

		System.out.println((up[n].add(left[n]).add(right[n])).mod(new BigInteger("12345")));

	}

}