import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d547 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sLine;
		while ((sLine = br.readLine()) != null) {
			String[] sArr = sLine.split("[ \\t]+");
			int N = Integer.valueOf(sArr[0]);
			int M = Integer.valueOf(sArr[1]);
			String hint = br.readLine();

			for (int i = 0; i < N; ++i) {
				String[] doors = new String[N];
				doors[i] = br.readLine();
				if (getNumber(doors[i]).equals(hint))
					System.out.println(doors[i]);
			}
		}
	}

	public static String theLast2Compare(String str) {
		String result = "";
		String[] s = str.split("[ ]+");
		int sLen = s.length;
		if (Integer.valueOf(s[sLen - 1]) >= Integer.valueOf(s[sLen - 2])) {
			result = "1";
		} else {
			result = "0";
		}
		return result;
	}

	public static String compareInterval(String str) {
		String result = "";
		String[] s = str.split("[ ]+");
		int sLen = s.length;
		for (int i = sLen - 1; i > 1; --i) {
			if (Math.abs(Integer.valueOf(s[i]) - Integer.valueOf(s[i - 1])) >= Integer.valueOf(s[i - 2])) {
				result = "1 " + result;
			} else {
				result = "0 " + result;
			}
		}
		return result;
	}

	public static String getNumber(String str) {
		String result = compareInterval(str) + theLast2Compare(str);
		return result;
	}
}