import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class d646 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;		

		while ((line = br.readLine()) != null) {
			BigInteger big1 = new BigInteger(line);
			BigInteger big2 = new BigInteger(br.readLine());

			System.out.println(big1.gcd(big2));
		}	
	}
}