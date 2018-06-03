import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c295 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstLineStr;
		while ((firstLineStr = br.readLine()) != null) {
			String[] firstLineS = firstLineStr.split(" ");
			int N = Integer.valueOf(firstLineS[0]);
			int M = Integer.valueOf(firstLineS[1]);

			int sum = 0;
			int[] max = new int[N];
			for (int i = 0; i < N; ++i) {
				String XiStr = br.readLine();
				String[] Xi = XiStr.split(" ");
				int Max = -1;

				for (int j = 0; j < M; ++j) {
					Max = Math.max(Max, Integer.valueOf(Xi[j]));
				}
				max[i] = Max;
				sum += Max;
			}

			boolean hasDivisibleNum = false;
			System.out.println(sum);
			for (int i = 0; i < N; ++i) {
//				if (max[i] > 0) {
					if (sum % max[i] == 0) {
						System.out.print(max[i] + " ");
						hasDivisibleNum = true;
					}
//				}
			}
			if (!hasDivisibleNum) {
				System.out.print(-1);
			}
		}
	}
}