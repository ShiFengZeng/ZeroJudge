import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c459 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");
			int carry = Integer.valueOf(strArr[0]);
			int num = Integer.valueOf(strArr[1]);
			int len = strArr[1].length();

			int dec = toDec(num, carry);
			int pow = toPow(num, len);

			if (dec == pow) {
				pw.println("YES");
			} else {
				pw.println("NO");
			}
		}
		pw.close();
	}

	static int toDec(int n, int c) {
		int result = 0;
		int ca = 0;

		while (n > 0) {
			result += (n % 10) * Math.pow(c, ca);
			n /= 10;
			ca++;
		}

		return result;
	}

	static int toPow(int n, int l) {
		int result = 0;

		while (n > 0) {
			result += Math.pow((n % 10), l);
			n /= 10;
		}

		return result;
	}
}