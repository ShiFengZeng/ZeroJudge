import java.util.Scanner;

public class a059_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int i = 1; i <= n; ++i) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int sum = 0;
				int jj = 0;

				int jMax = (int) Math.sqrt(b);
				for (int j = (int) Math.sqrt(a); j <= jMax; ++j) {
					jj = j * j;
					if (jj >= a && jj <= b) {
						sum += jj;
					}
				}
				System.out.println("Case " + i + ": " + sum);
			}
		}
		scan.close();
	}
}
