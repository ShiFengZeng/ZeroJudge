import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class c299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");
			int n = Integer.valueOf(strArr[0]);
			Integer[] numArr = new Integer[n];
			for (int i = 0; i < n; ++i) {
				numArr[i] = Integer.valueOf(strArr[i + 1]);
			}

			Arrays.sort(numArr);
			
			System.out.print(numArr[0] + " " + numArr[n - 1]);
			if (numArr[n - 1] - numArr[0] == n - 1) {
				System.out.println(" yes");
			} else {
				System.out.println(" no");
			}
		}
	}
}