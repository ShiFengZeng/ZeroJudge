import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d306 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			for (int i = 1; i <= n; ++i) {
				int S1 = Integer.valueOf(br.readLine(), 2);
				int S2 = Integer.valueOf(br.readLine(), 2);
				int L = gcd(S1, S2);
				if (L == 1) {
					System.out.println(String.format("Pair #%d: Love is not all you need!", i));
				} else {
					System.out.println(String.format("Pair #%d: All you need is love!", i));
				}
			}
		}
	}

	static int gcd(int a, int b) {
		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}