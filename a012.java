import java.util.Scanner;

public class a012 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLong()) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long c = Math.abs(a - b);

			System.out.println(c);
		}
	}
}
