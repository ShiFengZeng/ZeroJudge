import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b565 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");
			int len = Integer.valueOf(strArr[0]);
			int[] mushroom = new int[len];

			for (int i = 1; i <= len; ++i) {
				mushroom[i - 1] = Integer.valueOf(Integer.valueOf(strArr[i]));
			}

			int sum = 0;
			int max = 0;
			for (int i = 0; i < len; ++i) {
				sum += mushroom[i];
				sum = Math.max(0, sum);
				max = Math.max(sum, max);
			}
			System.out.println(max);
		}
	}

}