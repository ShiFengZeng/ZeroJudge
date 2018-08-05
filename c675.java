import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class c675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> F = new ArrayList<>();
		F.add(0, 0);
		for (int i = 1; i <= 15751; ++i) {
			String iStr = String.valueOf(i);
			if (iStr.contains("4"))
				continue;

			F.add(i);
		}

		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			String[] temp = line.split("[ ]+");
			String k = temp[0];
			int n = Integer.valueOf(temp[1]);

			if (k.equals("T")) {
				pw.println(F.get(n));
			} else {
				pw.println(F.indexOf(n));
			}
		}
		pw.flush();
	}
}
