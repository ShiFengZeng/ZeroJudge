import java.util.NoSuchElementException;
import java.util.Scanner;

public class d623 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, d;
		double detA;
		try {
			while (scan.hasNext()) {

				a = scan.nextDouble();
				b = scan.nextDouble();
				c = scan.nextDouble();
				d = scan.nextDouble();

				if (a == 0 && b == 0 && c == 0 && d == 0)
					break;
				detA = a * d - b * c;
				if (detA == 0)
					System.out.println("cheat!");
				else
					System.out.println(String.format("%.5f %.5f\n%.5f %.5f", 1 / detA * d, 1 / detA * -b, 1 / detA * -c,
							1 / detA * a));

			}
		} catch (NoSuchElementException ex) {
			scan.close();
		}
	}

}