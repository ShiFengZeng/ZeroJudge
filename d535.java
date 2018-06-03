import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d535 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strLine;

		while ((strLine = br.readLine()) != null) {
			System.out.println(getPassword(strLine));
		}
	}

	public static boolean checkLength(String str) {
		boolean result = false;
		int strLen = str.length();
		if (strLen >= 10 && strLen <= 30) {
			result = true;
		}
		return result;
	}

	public static boolean checkPalindrome(String str) {
		boolean result = true;
		int strLen = str.length();
		for (int i = 0; i < strLen / 2; ++i) {
			if (str.charAt(i) != str.charAt(strLen - 1 - i)) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static boolean checkMultiple(String str) {
		boolean result = true;
		int strLen = str.length();
		for (int i = 0; i < strLen / 2; ++i) {
			if ((str.charAt(i + 1) - '0') / (str.charAt(i) - '0') > 2) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static String getPassword(String str) {
		String result = "";
		if (checkLength(str) && checkPalindrome(str) && checkMultiple(str)) {
			int strLen = str.length();
			for (int i = 0; i < strLen; ++i) {
				if ((str.charAt(i) - '0') % 2 == 0) {
					result += (str.charAt(i) - '0');
				}
			}
		} else {
			result = "INCORRECT";
		}
		if (result.isEmpty()) {
			result = "0";
		}
		return result;
	}
}