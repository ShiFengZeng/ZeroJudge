import java.util.Scanner;

public class a130 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		String[] website = new String[10];
		int[] Vi = new int[10];

		while (scan.hasNext()) {
			n = scan.nextInt();
			

			for (int c = 0; c < n; ++c) {
				int max = 0;
				for (int i = 0; i < 10; ++i) {
					website[i] = scan.next();
					Vi[i] = scan.nextInt();
					if (Vi[i] > max) {
						max = Vi[i];
					}
				}
				System.out.println(String.format("Case #%d:", c + 1));
				for (int j = 0; j < 10; ++j) {
					if (max == Vi[j]) {
						System.out.println(website[j]);
					}
				}
			}
		}
		scan.close();
	}
}