import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b524 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		StringBuilder sb = new StringBuilder();
		while ((input = br.readLine()) != null) {
			int inputLen = input.length();
			int rightPostion = 0;
			int sum = 0;
			for (int i = 0; i < inputLen; ++i) {
				if (input.charAt(i) == 'y') {
					sum += Math.abs(i - rightPostion);
					rightPostion += 3;
				}
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb);
	}
}
