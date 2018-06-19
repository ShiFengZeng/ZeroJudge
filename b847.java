import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class b847 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			BigDecimal[] ascii = new BigDecimal[26];
			BigDecimal[] rate = new BigDecimal[26];
			for (int i = 0; i < 26; ++i) {
				ascii[i]=BigDecimal.ZERO;
				rate[i]=new BigDecimal("100");
			}
			int strLen = line.length();
			BigDecimal letterLen = new BigDecimal(strLen);
			for (int i = 0; i < strLen; ++i) {
				char temp = line.charAt(i);
				if (Character.isUpperCase(temp))
					temp = Character.toLowerCase(temp);
				if (temp >= 'a' && temp <= 'z')
					ascii[temp - 'a'] = ascii[temp - 'a'].add(BigDecimal.ONE);
				else {
					letterLen=letterLen.subtract(BigDecimal.ONE);
				}
			}
			
			for (int i = 0; i < 26; ++i) {
				rate[i] = rate[i].multiply(ascii[i].divide(letterLen, 4,BigDecimal.ROUND_HALF_EVEN));
			}

			for (int i = 0; i < 26; ++i) {
				System.out.print(String.format("%.0f ", ascii[i]));
			}
			System.out.println();
			
			for (int i = 0; i < 26; ++i) {
				System.out.print(String.format("%.2f ", rate[i]));
			}
			System.out.println();
		}
	}
}