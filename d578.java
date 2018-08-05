import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class d578 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		int m;
		String line;
		HashMap<String, Integer> map = new HashMap<>();
		while ((line = br.readLine()) != null) {
			String[] nm = line.split("[ ]+");
			n = Integer.valueOf(nm[0]);
			m = Integer.valueOf(nm[1]);
			if (n == m && m == 0) {
				break;
			} else {
				int range = n * m - 1;

				for (int i = 0; i < range; ++i) {
					String word = br.readLine();
					if (!map.containsKey(word)) {
						map.put(word, 1);
					} else {
						map.put(word, map.get(word) + 1);
					}
				}

				Set<Entry<String, Integer>> aEntrySet = map.entrySet();

				for (Entry<String, Integer> c : aEntrySet) {
					String temp = c.getKey();
					if (map.get(temp) == m - 1) {
						System.out.println(temp);
					}
				}

			}
		}
	}
}