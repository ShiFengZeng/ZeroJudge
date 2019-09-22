import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class d380 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		while ((line = br.readLine()) != null) {
			BigInteger a = new BigInteger(line);
			BigInteger b = new BigInteger(br.readLine());
			pw.println(a.multiply(b));
		}
		pw.close();
	}
}
