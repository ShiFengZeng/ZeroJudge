import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class d362 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		// ²Ä100000²Õ (18409199, 18409201)
		boolean[] isNotPrime = new boolean[18409202];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int i = 2; i * i <= 18409201; ++i) {
			if (!isNotPrime[i]) {
				for (int j = i * i; j <= 18409201; j += i) {
					isNotPrime[j] = true;
				}
			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		int index = 1;
		for (int i = 2; i < 18409200; ++i) {
			if (!isNotPrime[i] && !isNotPrime[(i + 2)]) {
				map.put(index++, i);
			}
		}

		while ((line = br.readLine()) != null) {
			int S = Integer.valueOf(line);
			pw.println(String.format("(%d, %d)", map.get(S), map.get(S) + 2));
		}
		pw.close();
	}
}