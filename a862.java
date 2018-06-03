import java.util.Scanner;

public class a862 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double V, R;

		while (scan.hasNext()) {
			V = scan.nextDouble();
			R = scan.nextDouble();

			System.out.println(String.format("%.4f", V / R * 1000));
		}
		scan.close();
	}
}