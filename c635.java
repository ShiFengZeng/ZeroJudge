import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;;

public class c635 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while ((str = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();
			String[] s = str.split(",");
			int len = s.length;
			int oddl = 0;
			int evenl = 0;
			if (len % 2 == 0) {
				oddl = len / 2;
				evenl = len / 2;
			} else {
				oddl = (len + 1) / 2;
				evenl = len / 2;
			}
			Integer[] odd = new Integer[oddl];
			Integer[] even = new Integer[evenl];

			for (int i = 0, j = 0; i < len && j < oddl; i += 2, j++) {
				odd[j] = Integer.valueOf(s[i]);
			}

			for (int i = 1, j = 0; i < len && j < evenl; i += 2, j++) {
				even[j] = Integer.valueOf(s[i]);
			}

			Arrays.sort(odd);
			Arrays.sort(even);
			sb.append(odd[0]);
			sb.append(","+even[0]);
			for (int i = 1; i < evenl; ++i) {
				sb.append("," + odd[i]);
				sb.append("," + even[i]);
			}
			if (oddl > evenl)
				sb.append("," + odd[oddl - 1]);
			System.out.println(sb);
		}
	}
}
