import java.util.Scanner;

public class a453 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int D = 0;

			for (int i = 0; i < n; ++i) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = scan.nextInt();

				D = b * b - 4 * a * c;
				if (D < 0) {
					System.out.println("No");
				} else {
					double sqrtD = Math.sqrt(D);
					int intD = (int) sqrtD;
					if (intD == sqrtD) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				}
			}
		}
	}
}
