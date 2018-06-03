import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			int[] ascii = new int[128];
			int maxCount = 0;
			int strLen = str.length();
			int maxAscii = 0;
			int minAscii = 150;

			for (int i = 0; i < strLen; ++i) {
				int asci = str.charAt(i);
				ascii[asci]++;
				maxAscii = Math.max(maxAscii, asci);
				minAscii = Math.min(minAscii, asci);
				maxCount = Math.max(maxCount, ascii[asci]);
			}
			for (int i = 1; i <= maxCount; ++i) {
				for (int j = maxAscii; j >= minAscii; --j) {
					if (ascii[j] == i) {
						System.out.println(j + " " + i);
					}
				}
			}
		}
	}
}
