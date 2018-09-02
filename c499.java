import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c499 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			String M = line;
			String B = br.readLine();
			int T = Integer.valueOf(br.readLine());

			int lenM = M.length();
			int lenB = B.length();
			int[][] LCS = new int[lenM + 1][lenB + 1];

			for (int i = 1; i <= lenM; ++i) {
				for (int j = 1; j <= lenB; ++j) {
					if (M.charAt(i - 1) == B.charAt(j - 1)) {
						LCS[i][j] = LCS[i - 1][j - 1] + 1;
					} else {
						LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
					}
				}
			}
			if (LCS[lenM][lenB] >= T) {
				System.out.println("kwa nini unaendesha");
			} else {
				System.out.println("sitini na tisa");
			}
		}		
	}

}