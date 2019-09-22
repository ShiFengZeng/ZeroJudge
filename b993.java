import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b993 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;

		while ((line = br.readLine()) != null) {
			String[] scores = br.readLine().split(" ");
			int max = 0;

			for (int i = 0; i < scores.length; ++i) {
				int s = Integer.valueOf(scores[i]);
				if (s > max) {
					max = s;
				}
			}
			pw.println(max);
		}
		pw.close();
	}
}
