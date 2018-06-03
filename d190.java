import java.util.Arrays;
import java.util.Scanner;

public class d190 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] age = new int[n];

			for (int i = 0; i < n; ++i) {
				age[i] = scan.nextInt();
			}

			Arrays.sort(age);
			for (int i = 0; i < n; ++i) {
				System.out.print(age[i] + " ");
			}
			System.out.println();

		}
		scan.close();
	}
}