import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d674 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1;
		String[] city = new String[2];
		int count = 0;
		StringBuilder sb = new StringBuilder();
		while ((str1 = br.readLine()) != null) {

			if (str1.equals("#")) {
				System.out.print(sb);
				break;
			} else {
				city[0] = str1;
				city[1] = br.readLine();

				int s1Len = city[0].length();
				int s2Len = city[1].length();
				int[][] LCS = new int[s1Len + 1][s2Len + 1];
				for (int i = 1; i <= s1Len; ++i) {
					for (int j = 1; j <= s2Len; ++j) {
						if (city[0].charAt(i - 1) == city[1].charAt(j - 1)) {
							LCS[i][j] = LCS[i - 1][j - 1] + 1;
						} else {
							LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
						}
					}
				}
				count++;
				sb.append(String.format("Case #%d: you can visit at most %d cities.\n", count, LCS[s1Len][s2Len]));
			}
		}
	}
}