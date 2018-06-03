import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
//import java.util.Scanner;

public class a884 {
	public static void main(String[] args) throws IOException {
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line;

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			for (int i = 0; i < n; ++i) {
				String number = br.readLine();
				String []numArr=number.split(" ");
				
				BigInteger num1 = new BigInteger(numArr[0]);
				BigInteger num2 = new BigInteger(numArr[1]);

				sb.append(num1.subtract(num2) + "\n");
			}
			System.out.print(sb);
		}
		// scan.close();
	}
}
