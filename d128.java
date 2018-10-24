import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d128 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;

		while ((line = br.readLine()) != null) {
			String[] inpSplit = line.split(" ");
			int a = Integer.valueOf(inpSplit[0]);
			int b = Integer.valueOf(inpSplit[1]);
			int c = Integer.valueOf(inpSplit[2]);
			int sum = 0;

			sum = Math.max(sum, a + b + c);
			sum = Math.max(sum, a + b * c);
			sum = Math.max(sum, a * b + c);
			sum = Math.max(sum, a * b * c);
			sum = Math.max(sum, a * (10 * b + c));
			sum = Math.max(sum, (10 * a + b) * c);
			sum = Math.max(sum, a + (10 * b + c));
			sum = Math.max(sum, (10 * a + b) + c);

			pw.println(sum);
		}
		pw.close();
	}
}
