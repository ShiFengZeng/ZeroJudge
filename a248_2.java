import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a248_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int n;
		String line;
		
		while ((line = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			String[] abc = line.split(" ");
			a = Integer.valueOf(abc[0]);
			b = Integer.valueOf(abc[1]);
			n = Integer.valueOf(abc[2]);

			int[] arr = new int[n + 1];

			arr[0] = a / b;
			a = (a - arr[0] * b) * 10;

			sb.append(arr[0] + ".");
			for (int i = 1; i <= n; ++i) {
				arr[i] = a / b;
				a = (a % b) * 10;
				sb.append(arr[i]);
			}
			System.out.println(sb);
		}		
	}
}