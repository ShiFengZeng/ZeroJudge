import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class c657 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream b_out = new BufferedOutputStream(System.out);
		String nLine;

		while ((nLine = br.readLine()) != null) {
			int strLen = nLine.length();
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			int count = 1;
			int max = 0;
			for (int i = 0; i < strLen - 1; ++i) {
				char temp = nLine.charAt(i);
				char temp2 = nLine.charAt(i + 1);
				if (temp == temp2) {
					count++;
				} else {
					if (count > max) {
						map.put(temp, count);
						max = Math.max(max, count);
					}
					count = 1;
				}
				if (count > max) {
					map.put(temp, count);
					max = Math.max(max, count);
				}
			}
			Set<Entry<Character, Integer>> aEntrySet = map.entrySet();

			for (Map.Entry<Character, Integer> c : aEntrySet) {
				Character temp = c.getKey();
				if (map.get(temp) == max) {
					b_out.write((temp + " " + max+"\n").getBytes());
				}				
			}
			b_out.flush();
		}
		b_out.close();
	}
}