import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c631 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String nLine;

		while ((nLine = br.readLine()) != null) {
			// int length = Integer.valueOf(nLine);
			String in = br.readLine();

			String lrStr;
			String[] lr = new String[2];
			while ((lrStr = br.readLine()) != null) {
				// StringBuilder stringBuilder = new StringBuilder();
				lr = lrStr.split(" ");
				int l = Integer.valueOf(lr[0]) - 1;
				int r = Integer.valueOf(lr[1]) - 1;
				for (int i = l; i <= r; i++) {
					pw.print(in.charAt(i));
				}
				pw.println();
			}
		}
		pw.flush();		
		pw.close();
		br.close();
	}
}