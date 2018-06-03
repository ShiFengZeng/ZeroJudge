import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class d681 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input;
		while ((input = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			String[] strInputArr = input.split(" ");
			int inputLengh = strInputArr.length;
			String[] strInputArrCopy = Arrays.copyOf(strInputArr, inputLengh);

			for (int i = 0; i < inputLengh - 1; ++i) {
				if (strInputArr[i].equals("and") || strInputArr[i].equals("or")) {
					strInputArr[i + 1] = CalOperator(strInputArr[i - 1], strInputArr[i], strInputArr[i + 1]).toString();
				}
			}

			for (int i = 0; i < inputLengh; ++i) {
				if (strInputArrCopy[i].equals("and")) {
					sb.append("&&");
				} else if (strInputArrCopy[i].equals("or")) {
					sb.append("||");
				} else {
					sb.append(strInputArrCopy[i]);
				}
			}
			sb.append(String.format(" = %s", strInputArr[inputLengh - 1]));
			System.out.println(sb);
		}
	}

	static StringBuilder CalOperator(String s1, String op, String s2) {
		StringBuilder sb = new StringBuilder();
		int strLengh = s1.length();

		if (op.equals("and")) {
			for (int i = 0; i < strLengh; ++i) {
				sb.append(Integer.valueOf(s1.charAt(i) - '0') & Integer.valueOf(s2.charAt(i) - '0'));
			}
		} else {
			for (int i = 0; i < strLengh; ++i) {
				sb.append(Integer.valueOf(s1.charAt(i) - '0') | Integer.valueOf(s2.charAt(i) - '0'));
			}
		}
		return sb;
	}
}