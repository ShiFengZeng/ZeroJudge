import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class d817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		BigInteger result = new BigInteger("2");		
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			System.out.println(result.pow(n));
		}		
	}
}
