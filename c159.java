import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c159 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		while ((line = br.readLine()) != null) {
			if (line.isEmpty())
				break;
			int n = Integer.valueOf(line);
			String[] inpStrArr = br.readLine().split(" ");

			int[] nums = new int[n];
			boolean[] isAdd = new boolean[20000];

			for (int i = 0; i < n; ++i) {
				nums[i] = Integer.valueOf(inpStrArr[i]);
			}

			for (int i = 0; i < n - 1; ++i) {
				for (int j = i + 1; j < n; ++j) {
					isAdd[nums[i] + nums[j]] = true;
				}
			}

			int count = 0;
			for (int i = 0; i < n; ++i) {
				if (isAdd[nums[i]])
					count++;
			}
			pw.println(count);
		}
		pw.close();
	}
}
