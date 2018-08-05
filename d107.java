import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d107 {
	public static void main(String[] args) throws IOException {
		boolean[] isNotPrime = new boolean[101];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int a = 2; a <= 10; ++a) {
			if (!isNotPrime[a]) {
				for (int b = a * a; b <= 100; b += a) {
					isNotPrime[b] = true;
				}
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int[] letterTimes = new int[26];
		while ((line = br.readLine()) != null) {
			int lineLen = line.length();
			for (int i = 0; i < lineLen; ++i) {
				int temp = line.charAt(i) - 'a';
				letterTimes[temp]++;
			}

			int maxn = 0;
			int minn = Integer.MAX_VALUE;
			for (int i = 0; i < 26; ++i) {
				if (letterTimes[i] > 0) {
					maxn = Math.max(maxn, letterTimes[i]);
					minn = Math.min(minn, letterTimes[i]);
				}
			}
			int diff = maxn - minn;
			if (!isNotPrime[diff]) {
				System.out.println("Lucky Word\n" + diff);
			}else {
				System.out.println("No Answer\n0");
			}
		}
	}
}
