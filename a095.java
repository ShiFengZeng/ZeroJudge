import java.util.Scanner;

public class a095 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long n;
		long m;
		while (scan.hasNext()) {
			n = scan.nextLong();
			m = scan.nextLong();

			if (m == n || m == n - 1) {
				System.out.println(n);
			} else {
				System.out.println(m + 1);
			}
		}
		scan.close();
	}
}
