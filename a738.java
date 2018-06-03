import java.util.Scanner;

public class a738 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			System.out.println(gcd(a, b));
		}
	}

	public static int gcd(int a, int b) {
		int result = a % b;

		while (result != 0) {
			a = b;
			b = result;
			result = a % b;
		}
		result = b;
		return result;
	}
}
