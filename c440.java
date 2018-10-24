import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c440 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuilder sb = new StringBuilder();

		while ((str = br.readLine()) != null) {
			sb.append(make(str) + "\n");
		}
		System.out.print(sb);
	}

	static long make(String str) {
		long count = 0;
		int strlen = str.length();
		int strlen_1 = strlen - 1;

		for (int i = 0; i < strlen - 2; ++i) {
			if (str.charAt(i) == 'Q') {
				for (int j = i + 1; j < strlen_1; ++j) {
					if (str.charAt(j) == 'A') {
						for (int k = j + 1; k < strlen; ++k) {
							if (str.charAt(k) == 'Q') {
								count++;
							}
						}
					}
				}
			}
		}
		return count;
	}
}