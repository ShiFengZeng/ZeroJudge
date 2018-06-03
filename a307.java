import java.util.Scanner;

public class a307 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			String str = "";
			while (n % 10 == 0) {
				n /= 10;
			}
			while (n != 0) {
				if (n < 0) {
					n *= -1;
					str += "-" + (n % 10);
					n /= 10;
				} else {
					str += (n % 10);
					n /= 10;
				}
			}

			System.out.println(str);
		}
	}
}
