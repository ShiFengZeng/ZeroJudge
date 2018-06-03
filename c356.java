import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c356 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String sLine;

		while ((sLine = br.readLine()) != null) {

			int N = Integer.valueOf(sLine);

			String code = br.readLine();
			int codeLength = code.length();
			int nextcode = N + 1;

			// code.chars().forEach((j)->System.out.print((char)j));
			for (int i = 0; i < codeLength; i += nextcode) {
				sb.append(code.charAt(i));
			}
			System.out.println(sb);
		}
	}
}