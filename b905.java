import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b905 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nLine;
		StringBuilder TS = new StringBuilder();
		StringBuilder ans = new StringBuilder();
		while ((nLine = br.readLine()) != null) {
			int n = Integer.valueOf(nLine);

			for (int i = 0; i < n; ++i) {
				String S = br.readLine();
				String T = br.readLine();
				String[] SA = S.split("[*]+");
				 S = S.replaceAll("[*]+", "[a-z]*");

				 System.out.println(S);
				TS.append(T);

				// Pattern r = Pattern.compile(S);
				// Matcher m = r.matcher(TS);

				// if (m.find()) {
				// ans.append("Yes\n");
				// } else {
				// ans.append("No\n");
				// }
			}
			// System.out.print(ans);
		}
	}
}