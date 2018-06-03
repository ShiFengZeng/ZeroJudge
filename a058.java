import java.util.Scanner;

public class a058 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			int mod30 = 0;
			int mod31 = 0;
			int mod32 = 0;

			for (int i = 0; i < n; ++i) {
				int a = scan.nextInt();
				if (a % 3 == 0) {
					mod30++;
				}
				if (a % 3 == 1) {
					mod31++;
				}
				if (a % 3 == 2) {
					mod32++;
				}
			}
			System.out.print(mod30 + " " + mod31 + " " + mod32);
		}
	}
}
