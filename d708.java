import java.util.Arrays;
import java.util.Scanner;

public class d708 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNextLong()) {
			try {
				n = scan.nextInt();

				long[] num = new long[n - 1];

				for (int i = 0; i < n - 1; ++i) {
					num[i] = scan.nextLong();
				}
				Arrays.sort(num);
				for (int j = 0; j < n - 2; j = j + 2) {
					if (num[j] != num[j + 1]) {
						System.out.println(num[j]);
						break;
					}
				}
			} catch (Exception ex) {
				
			}
		}
		scan.close();
	}
}