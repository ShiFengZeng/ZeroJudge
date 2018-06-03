
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
//import java.util.Scanner;

public class b949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		BigInteger n;
		String nLine;
		StringBuilder sb = new StringBuilder();
		while ((nLine = br.readLine()) != null) {
			n = new BigInteger(nLine);
			BigInteger bg = n.multiply(n).multiply(new BigInteger("25"));
			sb.append(bg + "\n");
		}
		// System.out.print(sb);
		out.print(sb);
		out.flush();		
		// scan.close();
	}
}