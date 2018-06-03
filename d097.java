import java.util.Arrays;
import java.util.Scanner;

public class d097 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			long[] num = new long[n];

			for (int i = 0; i < n; ++i) {
				num[i] = scan.nextLong();
			}

			long[] diff = new long[n - 1];

			for (int i = 0; i < num.length - 1; ++i) {
				diff[i] = Math.abs(num[i] - num[i + 1]);
			}

			Arrays.sort(diff);

			boolean isJolly = true;
			for (int i = 0; i < diff.length - 1; ++i) {
				if (Math.abs(diff[i] - diff[i + 1]) != 1) {
					isJolly = false;
				}
			}
			if (isJolly) {
				System.out.println("Jolly");
			} else {
				System.out.println("Not jolly");
			}
		}
		scan.close();
	}
}