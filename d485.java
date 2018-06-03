import java.util.Scanner;

public class d485 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			if (a % 2 == 1 && b % 2 == 1 && a == b) {
				System.out.println("0");
			} else {
				System.out.println((b - a) / 2 + 1);
			}
		}
	}
}
