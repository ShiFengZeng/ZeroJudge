import java.util.Scanner;

public class a104 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; ++i) {
				a[i] = scan.nextInt();
			}

			for (int i = n - 1; i > 0; --i) {
				for (int j = 0; j < i; ++j) {
					if (a[j] > a[j + 1]) {
						int temp = a[j + 1];
						a[j + 1] = a[j];
						a[j] = temp;
					}
				}
			}
			for (int i = 0; i < n; ++i) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}
}
