import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c381 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nmStr;

		
		while ((nmStr = br.readLine()) != null) {

			String[] nmS = nmStr.split(" ");
			int n = Integer.valueOf(nmS[0]);
			int m = Integer.valueOf(nmS[1]);

			if (n == 0 && m == 0) {
				break;
			} else {
				StringBuilder sb = new StringBuilder();
				StringBuilder ans = new StringBuilder();
				for (int i = 0; i < n; ++i) {
					sb.append(br.readLine());
				}

				String[] mStr = br.readLine().split(" ");
				for (int i = 0; i < m; ++i) {
					ans.append(sb.charAt(Integer.valueOf(mStr[i]) - 1));
				}
				System.out.println(ans);
			}
		}
	}
}