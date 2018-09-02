import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class d244 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");
			int len = strArr.length;
			int[] stones = new int[len];
			for (int i = 0; i < len; ++i) {
				stones[i] = Integer.valueOf(strArr[i]);
			}
			Arrays.sort(stones);

			for (int i = 1, j = 2; j < len; i += 3, j += 3) {
				if (stones[i] != stones[j]) {
					pw.println(stones[i]);
					break;
				}
			}
		}
		pw.close();
	}

}