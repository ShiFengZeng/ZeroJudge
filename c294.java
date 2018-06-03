import java.util.Scanner;

public class c294 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;

		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();

			if (a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			if (b > c) {
				int temp = b;
				b = c;
				c = temp;
			}
			if (a > b) {
				int temp = a;
				a = b;
				b = temp;
			}

			System.out.println(String.format("%d %d %d", a, b, c));

			int ab2 = a * a + b * b;
			int c2 = c * c;
			if (a + b < c) {
				System.out.println("No");
			} else {
				if (ab2 < c2) {
					System.out.println("Obtuse");
				} else if (ab2 == c2) {
					System.out.println("Right");
				} else {
					System.out.println("Acute");
				}
			}
		}
		scan.close();
	}
}