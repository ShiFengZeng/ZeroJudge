import java.util.Scanner;

public class d587 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] num = new int[3 + 1];

			for (int i = 0; i < n; ++i) {
				num[scan.nextInt()]++;
			}
			for (int i = 1; i <= 3; ++i) {
				for (int j = num[i]; j > 0; --j) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}