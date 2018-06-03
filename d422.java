import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d422 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		while ((input = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			int iLen = input.length();
			int nTemp = 0;
			for (int i = 0; i < iLen; ++i) {
				
				if (input.charAt(i) == '!') {
					sb.append("\n");
				} else if (input.charAt(i) == 'b') {
					for (int j = 0; j < nTemp; ++j) {
						sb.append(" ");
					}
					nTemp = 0;
				} else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
					nTemp += input.charAt(i) - '0';
				} else {
					for (int j = 0; j < nTemp; ++j) {
						sb.append(input.charAt(i));
					}
					nTemp = 0;
				}
			}
			System.out.println(sb);
		}		
	}
}