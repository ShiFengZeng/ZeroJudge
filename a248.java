import java.util.Scanner;

public class a248 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int n;

		while (scan.hasNext()) {
			StringBuilder sb = new StringBuilder();
			a = scan.nextInt();
			b = scan.nextInt();
			n = scan.nextInt();
			int[] arr = new int[n + 1];

			arr[0] = a / b;
			a = (a - arr[0] * b) * 10;

			sb.append(arr[0] + ".");
			for (int i = 1; i <= n; ++i) {
				arr[i] = a / b;
				a = (a % b) * 10;
				sb.append(arr[i]);
			}
			System.out.println(sb);
		}
		scan.close();
	}
}
