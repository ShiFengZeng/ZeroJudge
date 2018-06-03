import java.util.Scanner;

public class b558 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] a = new int[n];
			int sum = 1;

			for (int i = 1; i <= n; ++i) {
				sum = sum + i - 1;
			}
			System.out.println(sum);
		}
	}
}
