import java.util.Arrays;
import java.util.Scanner;

public class d659 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] salary = new int[3];

			for (int i = 0; i < n; ++i) {
				salary[0] = scan.nextInt();
				salary[1] = scan.nextInt();
				salary[2] = scan.nextInt();

				Arrays.sort(salary);

				System.out.println(String.format("Case %d: %d", i + 1, salary[1]));
			}
		}
		scan.close();
	}
}