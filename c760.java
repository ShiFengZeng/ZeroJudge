import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c760 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] names = br.readLine().split(" ");
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < names.length; ++i) {
			int len = names[i].length();
			pw.print(String.valueOf(names[i].charAt(0)).toUpperCase());
			for (int j = 1; j < len; ++j) {
				pw.print(names[i].charAt(j));
			}
			pw.println();
		}
		pw.close();
	}
}
