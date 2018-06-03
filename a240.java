import java.util.Scanner;

public class a240 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		int m;
		while (scan.hasNext()) {
			m = scan.nextInt();
			for (int i = 0; i < m; ++i) {
				n = scan.nextInt();
				int[] arr = new int[n + 1];
				int[] sum = new int[n + 1];
				int a = 10;

				for (int j = 1; j <= n; ++j) {
					arr[j] = a / 17;
					a = a % 17 * 10;
					sum[j] += sum[j - 1] + arr[j];
				}
				System.out.println(String.format("%d %d", arr[n], sum[n]));
			}
		}
		scan.close();
	}
}
