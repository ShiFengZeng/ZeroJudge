import java.util.Scanner;

public class c290 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.nextLine();

			int sum1 = 0;
			int sum2 = 0;

			for (int i = 0; i < str.length(); ++i) {
				if (i % 2 == 0) {
					sum1 += str.charAt(i) - '0';
				} else {
					sum2 += str.charAt(i) - '0';
				}
			}
			System.out.println(Math.abs(sum1 - sum2));
		}
	}
}
