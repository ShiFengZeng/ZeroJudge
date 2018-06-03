import java.util.Scanner;

public class d212 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			long a[] = new long[n + 1];

			a[0] = 1;
			a[1] = 1;
			for (int i = 2; i <= n; ++i) {
				a[i] += a[i - 1] + a[i - 2];
			}
			System.out.println(a[n]);
		}
	}
}
