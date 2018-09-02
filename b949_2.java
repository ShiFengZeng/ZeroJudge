import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;


public class b949_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		BigInteger n;
		String nLine;		
		while ((nLine = br.readLine()) != null) {
			n = new BigInteger(nLine);
			BigInteger bg = n.multiply(n).multiply(new BigInteger("25"));
			out.println(bg);
		}		
		out.close();	
	}
}