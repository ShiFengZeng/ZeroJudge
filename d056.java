import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d056 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			int N = Integer.valueOf(line);

			for (int i = 0; i < N; ++i) {
				br.readLine();
				int M = Integer.valueOf(br.readLine());
				int[][] nums = new int[M][2];
				for (int j = 0; j < M; ++j) {
					String[] inpStrArr = br.readLine().split(" ");
					nums[j][0] = Integer.valueOf(inpStrArr[0]);
					nums[j][1] = Integer.valueOf(inpStrArr[1]);
				}

				int temp = 0;
				int[] res = new int[M];
				temp = nums[M - 1][0] + nums[M - 1][1];
				res[M - 1] = temp % 10;
				temp /= 10;
				for (int k = M - 2; k >= 0; --k) {
					temp = nums[k][0] + nums[k][1] + temp;
					res[k] = temp % 10;
					temp /= 10;
				}

				for (int k = 0; k < M; ++k) {
					pw.print(res[k]);
				}
				pw.println();
				pw.println();
			}
		}
		pw.close();
	}
}
