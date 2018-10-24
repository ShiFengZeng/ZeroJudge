import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c561 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			int[] ability = new int[n];
			String[] inp = br.readLine().split(" ");
			for (int i = 0; i < n; ++i) {
				ability[i] = Integer.valueOf(inp[i]);
			}
			int max = 0;
			for (int i = 0; i < n; ++i) {
				int temp = reverse(ability[i]);
				if (max < temp) {
					max = temp;
				}
			}
			System.out.println(max);
		}
	}

	static int reverse(int num) {
		int result = 0;
		while (num > 0) {
			result = (result * 10) + (num % 10);
			num /= 10;
		}
		return result;
	}
}
