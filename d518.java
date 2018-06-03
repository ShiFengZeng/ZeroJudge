import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class d518 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nStr;

		while ((nStr = br.readLine()) != null) {
			HashMap<String, Integer> hm = new HashMap<>();
			StringBuilder sb = new StringBuilder();
			int n = Integer.valueOf(nStr);
			int num = 1;
			for (int i = 0; i < n; ++i) {
				String input = br.readLine();
				if (!hm.containsKey(input)) {
					hm.put(input, num);
					sb.append(String.format("New! %d\n", hm.get(input)));
					num++;
				} else {
					sb.append(String.format("Old! %d\n", hm.get(input)));
				}
			}
			System.out.print(sb);
		}
	}
}