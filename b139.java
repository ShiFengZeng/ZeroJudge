import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b139 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			String[] temp = line.split(" ");
			int L = Integer.valueOf(temp[0]);
			int M = Integer.valueOf(temp[1]);
			boolean[] tree = new boolean[L + 1];

			for (int i = 0; i < M; ++i) {
				String[] road = br.readLine().split(" ");
				int start = Integer.valueOf(road[0]);
				int end = Integer.valueOf(road[1]);

				for (int j = start; j <= end; ++j) {
					tree[j] = true;
				}
			}

			int result = 0;
			for (int i = 0; i <= L; ++i) {
				if (!tree[i]) {
					result++;
				}
			}
			pw.println(result);
		}
		pw.close();
	}

}