import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;

public class c666 {
	public static void main(String[] args) throws IOException {
		// 48611

		boolean[] isNotPrime = new boolean[48612];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int a = 2; a * a <= 48611; ++a) {
			if (!isNotPrime[a]) {
				for (int b = a * a; b <= 48611; b += a) {
					isNotPrime[b] = true;
				}
			}
		}
		ArrayList<BigInteger> primes = new ArrayList<>();
		for (int i = 2; i <= 48611; ++i) {
			if (!isNotPrime[i]) {
				primes.add(BigInteger.valueOf(i));
			}
		}

		BigInteger[] mulPrime = new BigInteger[5001];
		mulPrime[1] = primes.get(0); // 2
		mulPrime[2] = primes.get(1).multiply(primes.get(0));// 6

		for (int i = 3; i <= 5000; ++i) {
			mulPrime[i] = mulPrime[i - 1].multiply(primes.get(i - 1));
		}

		PrintWriter pw = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			pw.println(mulPrime[n]);
		}
		pw.flush();
		br.close();
	}
}
