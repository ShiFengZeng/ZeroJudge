import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class d385 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line.trim());
			if (n != 0) {
				String[] inp = br.readLine().split(" ");

				d385Comparator cmp = new d385Comparator();
				Arrays.sort(inp, cmp);
				for (int i = 0; i < n; ++i) {
					pw.print(inp[i]);
				}
				pw.println();
			} else {
				break;
			}
		}
		pw.close();
	}
}

class d385Comparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (s2 + s1).compareTo(s1 + s2);
	}

}
