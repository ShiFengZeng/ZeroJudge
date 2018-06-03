import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class d150 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int t = scan.nextInt();

			for (int i = 0; i < t; ++i) {
				int n = scan.nextInt();
				Integer[] price = new Integer[n];

				for (int j = 0; j < n; ++j) {
					price[j] = scan.nextInt();
				}

				Comparator<Integer> cmp = Collections.reverseOrder();
				Arrays.sort(price, cmp);
				
				int save = 0;
				for (int k = 2; k < n; k += 3) {
					save += price[k];
				}
				System.out.println(save);
			}
		}
		scan.close();
	}
}