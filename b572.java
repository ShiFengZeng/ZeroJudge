import java.util.Scanner;

public class b572 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int differenceTime = 0;

			for (int i = 0; i < n; ++i) {
				int H1 = scan.nextInt();
				int M1 = scan.nextInt();
				int H2 = scan.nextInt();
				int M2 = scan.nextInt();
				int T = scan.nextInt();

				if (M2 - M1 < 0) {
					M2 += 60;
					H2--;
				}
				differenceTime = (H2 - H1) * 60 + (M2 - M1);
				if (differenceTime >= T) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
