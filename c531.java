import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c531 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringBuilder sb = new StringBuilder();
		while ((str = br.readLine()) != null) {
			String[] s = str.split(",");
			int len = s.length;

			Integer[] oriArray = new Integer[len];
			List<Integer> index = new ArrayList<Integer>();
			List<Integer> num = new ArrayList<Integer>();

			for (int i = 0; i < len; ++i) {
				int temp = Integer.valueOf(s[i]);
				oriArray[i] = temp;
				if (temp % 2 == 0) {
					index.add(i);
					num.add(temp);
				}
			}
			Collections.sort(num);

			int arraySize = index.size();
			for (int i = 0; i < arraySize; ++i) {
				oriArray[index.get(i)] = num.get(i);
			}

			sb.append(oriArray[0]);
			for (int i = 1; i < len; ++i) {
				sb.append("," + oriArray[i]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
