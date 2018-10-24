import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class d194 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			int T = Integer.valueOf(line);
			for (int i = 0; i < T; ++i) {
				int n = Integer.valueOf(br.readLine());
				int[] snowflakes = new int[n];
				for (int j = 0; j < n; ++j) {
					snowflakes[j] = Integer.valueOf(br.readLine());
				}
				
				int leftIndex = 0, rightIndex = 0, maxLen = 0;
				HashSet<Integer> set = new HashSet<>();
				while (rightIndex < n) {
					if (!set.contains(snowflakes[rightIndex])) {
						set.add(snowflakes[rightIndex++]);
						maxLen = Math.max(maxLen, rightIndex - leftIndex);
					} else {
						set.remove(snowflakes[leftIndex++]);
					}
				}
				System.out.println(maxLen);
			}
		}
	}
}
