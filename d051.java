import java.util.Scanner;

public class d051 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double f = 0;
		while (scan.hasNext()) {
			f = scan.nextInt();
			System.out.println(String.format("%.3f", (f - 32) * 5 / 9));
		}
		scan.close();
	}
}
