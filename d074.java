import java.util.Scanner;

public class d074 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int a[] = new int[n];
			int Max = 0;

			for (int i = 0; i < n; ++i) {
				a[i] = scan.nextInt();

				if (Max < a[i]) {
					Max = a[i];
				}
			}
			System.out.println(Max);
		}
	}
}
