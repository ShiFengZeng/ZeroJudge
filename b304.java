import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nLine;
		while ((nLine = br.readLine()) != null) {
			int n = Integer.valueOf(nLine);

			for (int i = 0; i < n; ++i) {
				String str = br.readLine();
				int count = 0;
				int count2 = 0;
				int strLen = str.length();

				for (int j = 0; j < strLen; ++j) {
					if (str.charAt(j) == '(') {
						count++;
					} else if (str.charAt(j) == '[') {
						count2++;
					} else if (str.charAt(j) == ')') {
						count--;
						if (count < 0)
							break;
					} else if (str.charAt(j) == ']') {
						count2--;
						if (count2 < 0)
							break;
					}
				}
				if (count == 0 && count2 == 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}