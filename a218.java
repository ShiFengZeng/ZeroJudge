import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class a218 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			int[] nums = new int[n];
			String[] nStrArr = br.readLine().split(" ");
			for (int i = 0; i < n; ++i) {
				nums[i] = Integer.valueOf(nStrArr[i]);
			}

			HashMap<Integer, Integer> digit = new HashMap<>();

			for (int i = 0; i < n; ++i) {
				if (!digit.containsKey(nums[i])) {
					digit.put(nums[i], 1);
				} else {
					digit.put(nums[i], digit.get(nums[i]) + 1);
				}
			}
			List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(digit.entrySet());
			Collections.sort(list, new a218_Comp());

			for (Map.Entry<Integer, Integer> mapping : list) {
				pw.print(mapping.getKey() + " ");
			}
			pw.println();
		}
		pw.close();
	}
}

class a218_Comp implements Comparator<Entry<Integer, Integer>> {

	@Override
	public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
		return e2.getValue().compareTo(e1.getValue());
	}

}
