import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c291 {
	static int[] NUMS = new int[50001];
	static boolean[] ISTOKEN = new boolean[50001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		int next;
		while ((line = br.readLine()) != null) {

			int N = Integer.valueOf(line);
			String[] tempInp = br.readLine().split("[ ]+");

			for (int i = 0; i < N; ++i) {
				NUMS[i] = Integer.valueOf(tempInp[i]);
			}

			int result = 0;
			for (int i = 0; i < N; i++) {
				if (!ISTOKEN[i]) {
					if (NUMS[i] == i) {
						result++;
						ISTOKEN[i] = true;
					} else {
						next = i;
						do {
							ISTOKEN[next] = true;
							next = NUMS[next];
						} while (!ISTOKEN[next]);
						result++;
					}
				}
			}
			System.out.println(result);
		}
		pw.close();
	}

}