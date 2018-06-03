import java.util.Scanner;

public class a059 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int i = 1; i <= n; ++i) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int sum = 0;
				
				for (int j = 1; j < Math.sqrt(b); ++j) {
					if (j * j >= a && j * j <= b) {
						sum += j * j;
					}
				}
				System.out.println("Case " + i + ": " + sum);
			}
		}
	}
}
