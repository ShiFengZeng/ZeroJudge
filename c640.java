import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c640 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			String[] temp = line.split("[ ]+");
			int M = Integer.valueOf(temp[0]);
			int k = Integer.valueOf(temp[1]);

			String pLine = br.readLine();
			String[] pn = pLine.split("[ ]+");
			int pnLen = pn.length;
			int[] pi = new int[pnLen];
			for (int i = 0; i < pnLen; ++i) {
				pi[i] = Integer.valueOf(pn[i]);
			}
			int lcm = lcm(pi, pnLen);
			for (int i = 1;; i++) {
				int tmp = lcm * i + k;
				if (tmp <= M) {
					System.out.print(tmp + " ");
				} else {
					break;
				}
			}
			System.out.println();
		}
	}

	public static int gcd(int a, int b) {
		int result = 0;

		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		result = a;
		return result;
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static int gcd(int[] a, int len) {
		int result = 0;

		for (int i = 0; i < len - 1; ++i) {
			a[i + 1] = gcd(a[i], a[i + 1]);
		}
		result = a[len - 1];
		return result;
	}

	public static int lcm(int[] a, int len) {
		int result = 0;

		for (int i = 0; i < len - 1; ++i) {
			a[i + 1] = lcm(a[i], a[i + 1]);
		}
		result = a[len - 1];
		return result;
	}
}