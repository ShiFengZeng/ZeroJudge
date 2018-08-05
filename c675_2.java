import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class c675_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> F = new ArrayList<>();
		HashMap<Integer, Integer> T = new HashMap<>();
		F.add(0, 0);
		T.put(0, 0);
		for (int i = 1, t = 1; i <= 15751; ++i) {
			String iStr = String.valueOf(i);
			if (iStr.contains("4")) {
				continue;
			}
			F.add(i);
			T.put(i, t++);
		}
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			String[] temp = line.split(" ");
			String k = temp[0];
			Integer n = Integer.valueOf(temp[1]);

			if (k.equals("T")) {
				pw.println(F.get(n));
			} else {
				pw.println(T.get(n));
			}
		}
		pw.flush();
	}
}
