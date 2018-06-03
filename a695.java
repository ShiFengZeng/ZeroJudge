import java.util.Scanner;

public class a695 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			if (n % 2 == 0) {
				System.out.println(n / 2);
			} else if (n % 3 == 0) {
				System.out.println(n / 3);
			} else if (n % 5 == 0) {
				System.out.println(n / 5);
			} else if (n % 7 == 0) {
				System.out.println(n / 7);
			} else {
				for (int i = 11; i < Math.sqrt(n); i += 2) {
					if (n % i == 0) {
						System.out.println(n / i);
					}
				}
			}
		}
		scan.close();
	}
}