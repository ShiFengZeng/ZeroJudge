import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class a275 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line1;
		while ((line1 = br.readLine()) != null) {
			if (line1.equals("STOP!!"))
				break;
			String line2 = br.readLine();
			int[] asc = new int[128];

			for (int i = 0; i < line1.length(); ++i) {
				asc[line1.charAt(i)] += 1;
			}
			for (int i = 0; i < line2.length(); ++i) {
				asc[line2.charAt(i)] -= 1;
			}

			boolean isOK = true;
			for (int i = 0; i < asc.length; ++i) {
				if (asc[i] != 0) {
					pw.println("no");
					isOK = false;
					break;
				}
			}
			if (isOK) {
				pw.println("yes");
			}
		}
		pw.close();
	}
}
