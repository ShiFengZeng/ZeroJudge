import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class c705 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String num;
		while ((num = br.readLine()) != null) {
			BigInteger b = new BigInteger(num);
			String n = b.toString(2);
			n = "00000000000000000000000000000000".substring(0, 32 - n.length()) + n;
			int _1 = Integer.valueOf(n.substring(0, 8), 2);
			int _2 = Integer.valueOf(n.substring(8, 16), 2);
			int _3 = Integer.valueOf(n.substring(16, 24), 2);
			int _4 = Integer.valueOf(n.substring(24, 32), 2);
			pw.println(String.format("%d.%d.%d.%d", _1, _2, _3, _4));
		}
		pw.close();
	}
}
