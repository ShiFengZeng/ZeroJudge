import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c222 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			String[] sArr = line.split(" ");
			int a = Integer.valueOf(sArr[0]);
			int b = Integer.valueOf(sArr[1]);

			pw.println(a^b);
		}
		pw.close();
	}
}
