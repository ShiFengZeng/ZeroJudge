import java.util.Scanner;

public class b836 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n, m;

		while (scan.hasNext()) {
			n = scan.nextLong();
			m = scan.nextLong();
			int i = 1;

			if (m == 0) {
				System.out.println("Go Kevin!!");
				continue;
			}
			while (n > 0) {
				n -= i;
				i += m;
			}
			if (n == 0) {
				System.out.println("Go Kevin!!");
			} else {
				System.out.println("No Stop!!");
			}
		}
		scan.close();
	}
}