import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class d219 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		BigInteger B, P, M;

		while (scan.hasNext()) {
			B = scan.nextBigInteger();
			P = scan.nextBigInteger();
			M = scan.nextBigInteger();
			pw.println(B.modPow(P, M));
		}
		pw.flush();
		pw.close();
		scan.close();
	}
}