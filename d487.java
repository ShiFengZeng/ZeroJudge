import java.util.Scanner;

public class d487 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			System.out.printf("%d! = ", n);
			System.out.print(n == 0 ? 1 : n);
			for (int i = n; i > 1; --i) {
				System.out.printf(" * %d", i - 1);
			}
			System.out.println(String.format(" = %d", order(n)));
		}
		scan.close();
	}

	static int order(int n) {
		int res = 1;
		if (n > 0) {
			res = n * order(n - 1);
		}
		return res;
	}
}