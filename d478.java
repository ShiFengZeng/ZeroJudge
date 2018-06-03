import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class d478 {

	public static void main(String[] args) throws IOException {
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, m;
		String nLine;
		while ((nLine = br.readLine()) != null) {

			String[] str = nLine.split(" ");
			n = Integer.parseInt(str[0]);
			m = Integer.parseInt(str[1]);

			int[] 小潘 = new int[m];
			int[] 小花 = new int[m];

			for (int i = 0; i < n; ++i) {
				String 潘 = br.readLine();
				String[] p = 潘.split(" ");
				for (int j = 0; j < m; ++j) {
					小潘[j] = Integer.parseInt(p[j]);
				}

				String 花 = br.readLine();
				String[] h = 花.split(" ");
				for (int j = 0; j < m; ++j) {
					小花[j] = Integer.parseInt(h[j]);
				}

				int a = 0;
				int b = 0;
				int sameCoumt = 0;

				while (a < m && b < m) {
					if (小潘[a] < 小花[b]) {
						a++;
					} else if (小潘[a] > 小花[b]) {
						b++;
					} else {
						sameCoumt++;
						a++;
						b++;
					}
				}
				System.out.println(sameCoumt);
			}
		}
		// scan.close();
	}
}