import java.util.Scanner;

public class b004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			double D = scan.nextDouble();
			double L = scan.nextDouble();

			double a = L / 2;
			double dd = D / 2;
			double b = Math.sqrt((a * a) - (dd * dd));

			System.out.println(String.format("%.3f", 2*Math.acos(0) * a * b));
		}
		scan.close();
	}
}