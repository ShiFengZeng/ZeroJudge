import java.util.Arrays;
import java.util.Scanner;

public class d097_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] num = new int[n];

			for (int i = 0; i < n; ++i) {
				num[i] = scan.nextInt();
			}

			boolean[] hasDiff = new boolean[n];
			for (int i = 0; i < num.length - 1; ++i) {
				int diffAbs = Math.abs(num[i] - num[i + 1]);
				if (diffAbs > 0 && diffAbs < n) {
					hasDiff[diffAbs] = true;
				}
			}

			boolean isJolly = true;
			for (int i = 1; i < hasDiff.length; ++i) {
				if (hasDiff[i] == false) {
					isJolly = false;
					break;
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