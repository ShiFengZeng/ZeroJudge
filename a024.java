import java.util.Scanner;

public class a024 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			int a = scan.nextInt();
			int b = scan.nextInt();

			System.out.println(gcd(a, b));
		}
	}

	public static int gcd(int a, int b) {

		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}
