import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class a702 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		// ²Ä100000²Õ (18466729, 18466733)
		boolean[] isNotPrime = new boolean[18466734];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int i = 2; i * i <= 18466733; ++i) {
			if (!isNotPrime[i]) {
				for (int j = i * i; j <= 18466733; j += i) {
					isNotPrime[j] = true;
				}
			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		int index = 1;
		for (int i = 2; i < 18466732; ++i) {
			if (!isNotPrime[i] && !isNotPrime[(i + 4)]) {
				map.put(index++, i);
			}
		}

		while ((line = br.readLine()) != null) {
			int S = Integer.valueOf(line);
			pw.println(String.format("(%d, %d)", map.get(S), map.get(S) + 4));
		}
		pw.close();
	}
}