import java.util.Scanner;

public class b914 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] a = new int[n];
			int sum = 0;

			for (int i = 0; i < n; ++i) {
				a[i] = scan.nextInt();
				sum += a[i];
			}
			System.out.println(Math.round((float)sum / n));
		}
		scan.close();
	}
}