import java.util.Scanner;

public class a111 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int sum = 0;

			if (n == 0)
				break;
			for (int i = 1; i <= n; ++i) {
				sum += i * i;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}