import java.util.Scanner;

public class a410 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double delta;
		double deltaX;
		double deltaY;
		while (scan.hasNext()) {
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();
			d = scan.nextDouble();
			e = scan.nextDouble();
			f = scan.nextDouble();

			delta = a * e - d * b;
			deltaX = c * e - f * b;
			deltaY = a * f - d * c;

			if (delta != 0) {
				System.out.println(String.format("x=%.2f", (delta / deltaX)));
				System.out.println(String.format("y=%.2f", (delta / deltaY)));
			} else if (delta == 0 && deltaX == 0 && deltaY == 0) {
				System.out.println("Too many");
			} else {
				System.out.println("No answer");
			}
		}
		scan.close();
	}
}
