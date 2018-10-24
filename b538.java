import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b538 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			String[] inp = line.split(" ");
			int a = Integer.valueOf(inp[0]);
			int b = Integer.valueOf(inp[1]);
			int c = Integer.valueOf(inp[2]);
			int d = Integer.valueOf(inp[3]);
			String op = inp[4];
			int denominator = 0;
			int numerator = 0;

			switch (op) {
			case "+":
				int negative1 = -1;
				int negative2 = -1;
				if ((a < 0 && b < 0) || (a > 0 && b > 0))
					negative1 = 1;
				if ((c < 0 && d < 0) || (c > 0 && d > 0))
					negative2 = 1;
				denominator = Math.abs(b) * Math.abs(d);
				numerator = (Math.abs(a) * Math.abs(d) * negative1) + (Math.abs(b) * Math.abs(c) * negative2);
				break;
			case "-":
				negative1 = -1;
				negative2 = -1;
				if ((a < 0 && b < 0) || (a > 0 && b > 0))
					negative1 = 1;
				if ((c < 0 && d < 0) || (c > 0 && d > 0))
					negative2 = 1;
				denominator = b * d;
				numerator = a * d - b * c;
				break;
			case "*":
				denominator = b * d;
				numerator = a * c;
				break;
			case "/":
				denominator = b * c;
				numerator = a * d;
				break;
			default:
				break;
			}

			if (numerator == 0) {
				System.out.println(0);
			} else {
				int gcd = gcd(numerator, denominator);
				numerator /= gcd;
				denominator /= gcd;

				if (denominator < 0 && numerator < 0) {
					denominator *= -1;
					numerator *= -1;
				}

				if (denominator == 1)
					pw.println(numerator);
				else if (denominator < 0)
					pw.println(-1 * numerator + "/" + denominator * -1);
				else
					pw.println(numerator + "/" + denominator);
			}
		}
		pw.close();
	}

	static int gcd(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
