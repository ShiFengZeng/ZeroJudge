import java.util.Scanner;

public class a006 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int z = b * b - 4 * a * c;

			if (z > 0) {
				int x1 = (int) ((-b + Math.sqrt(z)) / 2 * a);
				int x2 = (int) ((-b - Math.sqrt(z)) / 2 * a);
				System.out.println("Two different roots x1=" + x1 + " , x2=" + x2);
			} else if (z == 0) {
				int x = -b / (2 * a);
				System.out.println("Two same roots x=" + x);
			} else {
				System.out.println("No real root");
			}
		}
	}
}
