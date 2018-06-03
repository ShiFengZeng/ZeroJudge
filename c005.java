import java.util.Scanner;

public class c005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int f;
		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				f = scan.nextInt();
				long sum = 0;
				for (int j = 0; j < f; ++j) {
					long a = scan.nextLong();
					long b = scan.nextLong();
					long c = scan.nextLong();

					sum += a * c;
				}
				System.out.println(sum);
			}

		}
		scan.close();
	}
}