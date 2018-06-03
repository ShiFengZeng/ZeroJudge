import java.util.Scanner;

public class c120 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] num = new int[2600];
			num[0] = 1;
			int m = 0;
			int carry = 0;

			for (int i = 2; i <= n; ++i) {
				for (int j = 0; j <= m; ++j) {
					num[j] *= i;
					num[j] += carry;
					carry = num[j] / 10;
					if (carry != 0 && j == m)
						m++;
					num[j] %= 10;
				}
			}

			System.out.println(n+"!");
			for (int i = m; i >= 0; --i) {
				System.out.print(num[i]);
			}
			System.out.println();
		}
		scan.close();
	}
}