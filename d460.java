import java.util.Scanner;

public class d460 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int ticket = 0;

			if (n >= 0 && n <= 5) {
				ticket = 0;
			} else if (n >= 6 && n <= 11) {
				ticket = 590;
			} else if (n >= 12 && n <= 17) {
				ticket = 790;
			} else if (n >= 18 && n <= 59) {
				ticket = 890;
			} else {
				ticket = 399;
			}

			System.out.println(ticket);
		}
	}
}
