import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class c658 {
	static boolean hasSol = false;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int strLen = line.length();
			String[] strArr = new String[strLen];
			for (int i = 0; i < strLen; ++i) {
				strArr[i] = String.valueOf(line.charAt(i));
			}
			Arrays.sort(strArr);
			listAll(Arrays.asList(strArr), "", strArr.length);
			if (!hasSol)
				System.out.println(0);
		}
	}

	public static void listAll(List candidate, String prefix, int len) {

		if (prefix.length() == len) {
			if (isSqure(Integer.valueOf(prefix))) {
				System.out.print(prefix + " ");
				hasSol = true;
			}
		}

		for (int i = 0; i < candidate.size(); i++) {
			List tmp = new LinkedList(candidate);
			listAll(tmp, prefix + tmp.remove(i),len);
		}
	}

	public static boolean isSqure(int n) {
		double fsqrt = Math.sqrt(n);
		int m = (int) fsqrt;

		return m * m == n;
	}

}