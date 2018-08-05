import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d275 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			int t = Integer.valueOf(line);
			for (int i = 0; i < t; ++i) {
				String input = br.readLine();
				int inputLen = input.length();
				int M = 0;
				int F = 0;
				for (int j = 0; j < inputLen; ++j) {
					if (input.charAt(j) == 'M') {
						M++;
					} else if (input.charAt(j) == 'F') {
						F++;
					}
				}
				if (M > 1 && M == F) {
					pw.println("LOOP");
				} else {
					pw.println("NO LOOP");
				}
			}
		}
		pw.close();
	}
}
