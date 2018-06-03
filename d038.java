import java.util.Scanner;

public class d038 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			long[] num = new long[n + 1];

			if (n == 0)
				break;

			num[0] = 1;
			num[1] = 1;
			for (int i = 2; i <= n; ++i) {
				num[i] = num[i - 1] + num[i - 2];
			}
			System.out.println(num[n]);
		}
		scan.close();
	}
}