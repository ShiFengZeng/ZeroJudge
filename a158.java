import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class a158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int N = Integer.valueOf(line);

			for (int i = 0; i < N; ++i) {
				String[] inpStrArr = br.readLine().split("[ ]+");
				int n = inpStrArr.length;
				int[] nums = new int[n];
				for (int j = 0; j < n; ++j) {
					nums[j] = Integer.valueOf(inpStrArr[j]);
				}

				int max = 0;
				for (int k = 0; k < n; ++k) {
					for (int l = k + 1; l < n; ++l) {
						max = Math.max(max, gcd(nums[k], nums[l]));
					}
				}
				pw.println(max);
			}
		}
		pw.close();
	}

	static int gcd(int a, int b) {
		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

}
