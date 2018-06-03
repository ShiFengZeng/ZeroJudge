import java.util.Scanner;

public class a147 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			for (int i = 0; i < n; ++i) {
				if (i % 7 == 0) {
					continue;
				}
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
