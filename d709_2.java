import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d709_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		boolean[] isNotPrime = new boolean[1000000 + 1];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int a = 2; a * a <= 1000000; ++a) {
			if (!isNotPrime[a]) {
				for (int b = a * a; b <= 1000000; b += a) {
					isNotPrime[b] = true;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			n = Integer.valueOf(line);
			if (n == 0) {
				System.out.println(sb);
				break;
			} else if (isNotPrime[n]) {
				sb.append("1\n");
			} else {
				sb.append("0\n");
			}
		}		
	}
}