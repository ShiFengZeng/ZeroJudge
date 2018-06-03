import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class d634 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nStr;
		StringBuilder sb = new StringBuilder();
		while ((nStr = br.readLine()) != null) {
			int n = Integer.valueOf(nStr);
			String[] strInputArr = new String[n];
			for (int i = 0; i < n; ++i) {
				strInputArr[i] = br.readLine();
			}
			Arrays.sort(strInputArr);
			for (String str : strInputArr) {
				sb.append(str+"\n");
			}
			System.out.print(sb);
		}
	}
}