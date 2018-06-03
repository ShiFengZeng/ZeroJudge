import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d139 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(Compress(str));
		}
	}

	static StringBuilder Compress(String str) {
		StringBuilder sb = new StringBuilder();
		int strLen = str.length();
		str += " ";
		int charLength = 1;
		for (int i = 0; i < strLen; ++i) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				charLength++;
			} else {
				if (charLength == 1) {
					sb.append(str.charAt(i));
				} else if (charLength == 2) {
					sb.append(String.format("%s%s", str.charAt(i),str.charAt(i)));
				} else {
					sb.append(String.format("%d%s", charLength, str.charAt(i)));
				}
				charLength = 1;
			}
		}
		return sb;
	}
}