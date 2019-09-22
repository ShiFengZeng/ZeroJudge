import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class d499 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inpStrArr = br.readLine().split(" ");
		BigInteger b = new BigInteger(inpStrArr[0]);
		System.out.println(b.pow(Integer.valueOf(inpStrArr[1])));
	}
}
