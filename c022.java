import java.util.Scanner;

public class c022 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T;

		while (scan.hasNext()) {
			T = scan.nextInt();

			for (int i = 0; i < T; ++i) {
				int sum = 0;
				int a = scan.nextInt();
				int b = scan.nextInt();

				for (int j = a; j <= b; ++j) {
					if (j % 2 == 1) {
						sum += j;
					}
				}
				System.out.println(String.format("Case %d: %d", i + 1, sum));
			}
		}
		scan.close();
	}
}