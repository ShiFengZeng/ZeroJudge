import java.util.Scanner;

public class d318 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			if (n < 0)
				break;
			if (n == 0) {
				System.out.println("0");
			} else {
				System.out.println(ternary(n));
			}
		}
		scan.close();
	}

	public static String ternary(int n) {
		String s = "";

		while (n != 0) {
			s = n % 3 + s;
			n /= 3;
		}

		return s;
	}
}