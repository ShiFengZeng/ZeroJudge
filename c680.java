import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c680 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int T = Integer.valueOf(br.readLine());
		String ans = br.readLine();
		int pc = Integer.valueOf(br.readLine());

		for (int i = 0; i < pc; i++) {
			String pa = br.readLine();

			int c = 0;
			for (int j = 0; j < Math.min(ans.length(), pa.length()); j++) {
				if (ans.charAt(j) == pa.charAt(j)) {
					c += 1;
				}
			}
			pw.println(100 / T * c);
		}
		pw.close();
	}
}
