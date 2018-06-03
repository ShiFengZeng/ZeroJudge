import java.util.Scanner;

public class c013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int A, B;
		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				A = scan.nextInt();
				B = scan.nextInt();

				for (int j = 0; j < B; ++j) {
					for (int k = 1; k <= A; ++k) {
						for (int l = 1; l <= k; ++l) {
							System.out.print(k);
						}
						System.out.println();
					}

					for (int k = A - 1; k >= 1; --k) {
						for (int l = 1; l <= k; ++l) {
							System.out.print(k);
						}
						System.out.println();
					}
					System.out.println();
				}
			}
		}
		scan.close();
	}
}