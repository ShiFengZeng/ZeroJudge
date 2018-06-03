import java.util.Scanner;

public class d493 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			long a = scan.nextLong();
			long n = scan.nextLong();

			System.out.println((long) Math.pow(a, n));
		}
	}
}
