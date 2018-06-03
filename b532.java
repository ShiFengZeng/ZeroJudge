import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b532 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);

			for (int i = 0; i < n; ++i) {
				int num1 = 0;
				int num2 = 0;
				int sum = 0;
				String str = br.readLine();
				char op = ' ';
				int opPosition = 0;
				int strLen = str.length();
				for (int j = 0; j < strLen; ++j) {
					if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
						num1 = num1 * 10 + Integer.valueOf(str.charAt(j) - '0');
					} else if (str.charAt(j) == '+' || str.charAt(j) == '-' || str.charAt(j) == '*'
							|| str.charAt(j) == '/' || str.charAt(j) == '%') {
						op = str.charAt(j);
						opPosition = j;
						break;
					}
				}
				for (int j = opPosition; j < strLen; ++j) {
					if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
						num2 = num2 * 10 + Integer.valueOf(str.charAt(j) - '0');
					}
				}

				switch (op) {
				case '+':
					sum = num1 + num2;
					break;
				case '-':
					sum = num1 - num2;
					break;
				case '*':
					sum = num1 * num2;
					break;
				case '/':
					sum = num1 / num2;
					break;
				case '%':
					sum = num1 % num2;
					break;
				}
				System.out.println(sum);
			}
		}
	}

}
