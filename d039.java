import java.util.Scanner;

public class d039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		int n, m;
		while (scan.hasNext()) {
			t = scan.nextInt();
			for (int i = 0; i < t; ++i) {
				n = scan.nextInt();
				m = scan.nextInt();

				System.out.println((n / 3) * (m / 3));
			}
		}
		scan.close();
	}
}