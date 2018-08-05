import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class c666_2 {
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
		BigInteger[] primes = new BigInteger[48612];
		int index = 0;
		for (int i = 2; i <= 48611; ++i) {
			if (!isNotPrime[i]) {
				primes[index] = BigInteger.valueOf(i);
				index++;
			}
		}

		BigInteger[] mulPrime = new BigInteger[5001];
		mulPrime[1] = primes[0]; // 2
		mulPrime[2] = primes[1].multiply(primes[0]);// 6

		for (int i = 3; i <= 5000; ++i) {
			mulPrime[i] = mulPrime[i - 1].multiply(primes[i-1]);
		}

		PrintWriter pw = new PrintWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			pw.println(mulPrime[Integer.valueOf(line)]);
		}
		
		pw.flush();
		br.close();
	}
}
