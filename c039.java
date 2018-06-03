import java.util.Scanner;

public class c039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		int length = 0;

		while (scan.hasNext()) {
			int max = 0;
			i = scan.nextInt();
			j = scan.nextInt();

			if (i <= j) {
				for (int k = i; k <= j; ++k) {
					length = calCycleLength(k);
					if (max < length) {
						max = length;
					}
				}
			} else {
				for (int k = i; k >= j; --k) {
					length = calCycleLength(k);
					if (max < length) {
						max = length;
					}
				}
			}

			System.out.println(String.format("%d %d %d", i, j, max));
		}
		scan.close();
	}

	public static int calCycleLength(int n) {
		int length = 1;

		while (n != 1) {
			if (n % 2 == 0) {
				length++;
				n /= 2;
			} else {
				length++;
				n = 3 * n + 1;
			}
		}

		return length;
	}
}