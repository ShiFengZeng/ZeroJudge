import java.util.Scanner;

public class d143 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				int a = scan.nextInt();
				int b = scan.nextInt();

				if (a > b) {
					System.out.println(">");
				} else if (a < b) {
					System.out.println("<");
				} else {
					System.out.println('=');
				}
			}
		}
		scan.close();
	}
}