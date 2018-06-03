import java.util.Scanner;

public class a216 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			long[] fn = new long[n + 1];
			long[] gn = new long[n + 1];

			fn[1] = 1;
			gn[1] = 1;

			for (int i = 2; i <= n; ++i) {
				fn[i] += i + fn[i - 1];
				gn[i] += fn[i] + gn[i - 1];
			}
			System.out.println(fn[n] + " " + gn[n]);
		}
	}
}