import java.util.Scanner;

public class c004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				int s = scan.nextInt(); // a+b
				int d = scan.nextInt(); // |a-b|

				if (d > s) {
					System.out.println("impossible");
				} else if (d == s) {
					System.out.println(d + " 0");
				} else {
					if ((s + d) % 2 == 1) {
						System.out.println("impossible");
					} else {
						for (int a = s; a >= 0; --a) {
							for (int b = 0; b <= s - a; ++b) {
								if (a + b == s && a - b == d) {
									System.out.println(a + " " + b);
									break;
								}
							}
						}
					}
				}
			}
		}
		scan.close();
	}
}