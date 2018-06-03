import java.util.Arrays;
import java.util.Scanner;

public class b520 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] lotto = new int[5];
		int[] num = new int[5];
		while (scan.hasNext()) {
			n = scan.nextInt();

			String str = scan.nextLine();
			for (int i = 0; i < n; ++i) {
				str = scan.nextLine();
				String[] s = str.split("[ ]*,[ ]*");

				for (int j = 0; j < s.length; ++j) {
					lotto[j] = Integer.parseInt(s[j]);
				}
				str = scan.nextLine();
				String[] s2 = str.split("[ ]*,[ ]*");
				for (int j = 0; j < s2.length; ++j) {
					num[j] = Integer.parseInt(s2[j]);
				}

				Arrays.sort(lotto);
				Arrays.sort(num);

				int sameCount = 0;
				int ln = 0, nn = 0;
				while (ln < 5 && nn < 5) {
					if (lotto[ln] > num[nn]) {
						nn++;
					} else if (lotto[ln] < num[nn]) {
						ln++;
					} else {
						sameCount++;
						nn++;
						ln++;
					}
				}
				System.out.println(sameCount);
			}
		}
		scan.close();
	}
}