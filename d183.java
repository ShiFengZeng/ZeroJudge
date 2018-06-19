import java.util.Scanner;

public class d183 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			N = scan.nextInt();
			boolean hasSol = false;

			if (N == 0) {
				System.out.print(sb);
				break;
			} else {
				int end = 98765 / N;
				for (int dividend = 1234; dividend <= end; ++dividend) {
					int divisor = dividend * N;

					if (divisor >= 12345 && check(divisor, dividend)) {
						sb.append(String.format("%d / %05d = %d\n", divisor, dividend, N));
						hasSol = true;

					}
				}

				if (!hasSol) {
					sb.append(String.format("There are no solutions for %d.\n", N));
				}
			}
		}
		scan.close();
	}

	public static boolean check(int abcde, int fghij) {
		boolean[] isUsed = new boolean[10];
		if (fghij < 10000)
			isUsed[0] = true;
		while (abcde > 0) {
			int temp = abcde % 10;
			if (isUsed[temp]) {
				return false;
			}
			isUsed[temp] = true;
			abcde /= 10;
		}
		while (fghij > 0) {
			int temp = fghij % 10;
			if (isUsed[temp]) {
				return false;
			}
			isUsed[temp] = true;
			fghij /= 10;
		}
		return true;
	}
}