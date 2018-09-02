import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a133 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;		
		int n = 1;
		while ((line = br.readLine()) != null) {
			String[] N1N2 = line.split(" ");
			int N1 = Integer.valueOf(N1N2[0]);
			int N2 = Integer.valueOf(N1N2[1]);
			if (N1 == N2 && N1 == 0) {				
				break;
			}
			
			int[] tower1 = new int[N1];
			int[] tower2 = new int[N2];
			String[] input1 = br.readLine().split(" ");
			for (int i = 0; i < N1; ++i) {
				tower1[i] = Integer.valueOf(input1[i]);
			}
			String[] input2 = br.readLine().split(" ");
			for (int i = 0; i < N2; ++i) {
				tower2[i] = Integer.valueOf(input2[i]);
			}

			int[][] LCS = new int[N1 + 1][N2 + 1];

			for (int i = 1; i <= N1; ++i) {
				for (int j = 1; j <= N2; ++j) {
					if (tower1[i - 1] == tower2[j - 1]) {
						LCS[i][j] = LCS[i - 1][j - 1] + 1;
					} else {
						LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
					}
				}
			}
			System.out.println("Twin Towers " + "#" + n++ + "\n" + "Number of Tiles : " + LCS[N1][N2]);			
		}		
	}

}