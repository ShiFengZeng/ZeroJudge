import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a537 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		String tStr;

		boolean[] notPrime = new boolean[2002];
		notPrime[1] = true;
		notPrime[0] = true;
		for (int i = 2; i * i < notPrime.length; i++)
			if (!notPrime[i])
				for (int j = i * 2; j < notPrime.length; j += i)
					notPrime[j] = true;

		while ((tStr = br.readLine()) != null) {
			T = Integer.parseInt(tStr);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < T; ++i) {

				int[] ascii = new int[128];
				String str = br.readLine();

				sb.append(String.format("Case %d: ", i + 1));
				for (int j = 0; j < str.length(); ++j) {
					ascii[str.charAt(j)]++;
				}

				int primeCount = 0;
				for (int j = 0; j < 128; ++j) {
					if (!notPrime[ascii[j]]) {
						sb.append((char) j);
						primeCount++;
					}
				}
				sb.append(primeCount > 0 ? "\n" : "empty\n");
			}
			System.out.println(sb);
		}
	}
}