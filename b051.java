import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class b051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			String[] strArr = line.split(" ");
			int n = Integer.valueOf(strArr[0]);
			String[] numArr = new String[n];
			for (int i = 0; i < n; ++i) {
				numArr[i] = strArr[i + 1];
			}
			Comparator<String> cmp = new MyComparator();
			Arrays.sort(numArr, cmp);
			for (int i = 0; i < n; ++i) {
				System.out.print(numArr[i]);
			}
			System.out.println();
		}
	}
}

class MyComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return (s2+s1).compareTo(s1+s2);
	}
}