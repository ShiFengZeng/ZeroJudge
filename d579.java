import java.util.Scanner;

public class d579 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double n;

		while (scan.hasNext()) {
			n = scan.nextDouble();

			System.out.println(String.format("|%.4f|=%.4f", n, Math.abs(n)));
		}
		scan.close();
	}
}