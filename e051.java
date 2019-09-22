import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		String line;
		while ((line = br.readLine()) != null) {
			int len = line.length();
			StringBuilder mid = new StringBuilder();
			for (int i = 0; i < len - 2; i++) {
				mid.append("_");
			}
			pw.println(line.charAt(0) + mid.toString() + line.charAt(len - 1));
		}
		pw.close();
	}
}
