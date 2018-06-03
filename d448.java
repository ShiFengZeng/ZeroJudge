import java.util.Scanner;

public class d448 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double t1, t2, t3, x1, x3, x2;
		while (scan.hasNext()) {
			t1 = scan.nextDouble();
			t2 = scan.nextDouble();
			t3 = scan.nextDouble();
			x1 = scan.nextDouble();
			x3 = scan.nextDouble();

			x2 = (x3 * (t1 - t2) + x1 * (t2 - t3)) / (t1 - t3);
			
			System.out.println(String.format("%6f", x2));
		}
		scan.close();
	}
}