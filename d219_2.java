import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class d219_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		long B, P, M;

		while (scan.hasNext()) {
			B = scan.nextLong();
			P = scan.nextLong();
			M = scan.nextLong();
			pw.println(BigMod(B, P, M));
		}
		pw.flush();
		pw.close();
		scan.close();
	}

	// ¤Àªvªk
	public static long BigMod(long b, long p, long m) {
		if (p == 0)
			return 1;
		if (p == 1)
			return b % m;

		long temp = BigMod(b, p / 2, m);
		if (p % 2 == 0)
			return (temp * temp) % m;
		else
			return (temp * temp * b) % m;

	}
}