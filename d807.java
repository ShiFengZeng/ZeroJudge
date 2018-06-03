import java.util.Scanner;

public class d807 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int m;

		while (scan.hasNext()) {
			n = scan.nextInt();
			m = scan.nextInt();

			System.out.println(gcd(n, m));
		}
		scan.close();
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