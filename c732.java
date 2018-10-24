import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class c732 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());

		String[] cattleStrArr = br.readLine().split(" ");
		int[] cattle = new int[n];
		for (int i = 0; i < n; ++i) {
			cattle[i] = Integer.valueOf(cattleStrArr[i]);
		}

		Arrays.sort(cattle);
		int max = 0;
		for (int i = 0; i < n / 2; ++i) {
			max = Math.max(max, cattle[i] + cattle[n - i - 1]);
		}
		
		System.out.println(max);
	}
}
