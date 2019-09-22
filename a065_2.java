import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class a065_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;

		while ((line = br.readLine()) != null) {	
			for (int i = 1; i < 7; ++i) {
				int a = Math.abs(line.charAt(i) - line.charAt(i-1));
				pw.print(a);
			}
			pw.println();
		}
		pw.close();
	}
}