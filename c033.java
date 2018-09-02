import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class c033 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		boolean[] isNotPrime = new boolean[1001];
		isNotPrime[0] = true;
		isNotPrime[1] = false;
		for (int i = 2; i * i <= 1000; ++i) {
			if (!isNotPrime[i]) {
				for (int j = i * i; j <= 1000; j += i) {
					isNotPrime[j] = true;
				}
			}
		}
		while ((line = br.readLine()) != null) {
			String[] NC = line.split(" ");
			int N = Integer.valueOf(NC[0]);
			int C = Integer.valueOf(NC[1]);
			ArrayList<Integer> primes = new ArrayList<Integer>();
			for (int i = 1; i <= N; ++i) {
				if (!isNotPrime[i]) {
					primes.add(i);
				}
			}
			int K = primes.size();

			pw.print(N + " " + C + ": ");
			if (K % 2 == 0) {
				C = C * 2;
			} else {
				C = (C * 2) - 1;
			}

			if (C >= K) {
				for (int i = 0; i < K; i++) {
					pw.print(primes.get(i) + " ");
				}
			} else {
				int start = (K / 2) - (C / 2);
				for (int i = start; i < start + C; i++) {
					pw.print(primes.get(i) + " ");
				}
			}
			pw.println();

		}
		pw.close();
	}
}