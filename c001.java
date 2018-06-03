import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1;

		while ((str1 = br.readLine()) != null) {
			String str2 = br.readLine();

			int str1Len = str1.length();
			int str2Len = str2.length();

			int[][] LCS = new int[str1Len + 1][str2Len + 1];
			for (int i = 1; i <= str1Len; ++i) {
				for (int j = 1; j <= str2Len; ++j) {
					if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
						LCS[i][j] = LCS[i - 1][j - 1] + 1;
					} else {
						LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
					}
				}
			}
			System.out.println(LCS[str1Len][str2Len]);
		}
	}

}