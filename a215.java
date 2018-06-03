import java.util.Scanner;

public class a215 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int sum = 0;
			int count = 0;

			for (int i = n; i <= m||i>m; ++i) {
				sum += i;
				count++;
				if (sum > m) {
					System.out.println(count);
					break;
				}
			}
		}
	}
}
