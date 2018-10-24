import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class a539 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			int[] nums = new int[n];
			int count = 0;
			String[] tempStr = br.readLine().split(" ");
			for (int i = 0; i < n; ++i) {
				nums[i] = Integer.valueOf(tempStr[i]);
			}

			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n - i - 1; ++j) {
					if (nums[j] > nums[j + 1]) {
						int temp = nums[j];
						nums[j] = nums[j + 1];
						nums[j + 1] = temp;
						count++;
					}
				}
			}
			pw.println("Minimum exchange operations : " + count);
		}
		pw.close();
	}

}
