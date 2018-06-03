import java.math.BigInteger;
import java.util.Scanner;

public class d238 {

	public static void main(String[] args) {
		String str = BigInteger.valueOf(2).pow(1000).toString();
		int sum = 0;

		for (int i = 0; i < str.length(); ++i) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
