import java.util.Scanner;

public class d122 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			long n = scan.nextLong();
			long count = 0;

			for (long i = 5; i <= n; i *= 5) {
				count += n / i;
			}
			System.out.println(count);
		}
		scan.close();
	}
}
