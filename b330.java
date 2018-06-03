import java.util.Scanner;

public class b330 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			String x = scan.next();
			int xx = Integer.valueOf(x);
			int count = 0;

			for (int i = 1; i <= n; ++i) {
				String str = String.valueOf(i);
				for (int j = 0; j < str.length(); ++j) {
					if (str.charAt(j) - '0' == xx) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
