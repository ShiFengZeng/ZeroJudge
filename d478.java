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

			int[] �p�� = new int[m];
			int[] �p�� = new int[m];

			for (int i = 0; i < n; ++i) {
				String �� = br.readLine();
				String[] p = ��.split(" ");
				for (int j = 0; j < m; ++j) {
					�p��[j] = Integer.parseInt(p[j]);
				}

				String �� = br.readLine();
				String[] h = ��.split(" ");
				for (int j = 0; j < m; ++j) {
					�p��[j] = Integer.parseInt(h[j]);
				}

				int a = 0;
				int b = 0;
				int sameCoumt = 0;

				while (a < m && b < m) {
					if (�p��[a] < �p��[b]) {
						a++;
					} else if (�p��[a] > �p��[b]) {
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