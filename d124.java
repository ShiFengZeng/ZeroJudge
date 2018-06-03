import java.util.Scanner;

public class d124 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.next();
			int sum = 0;

			for (int i = 0; i < str.length(); ++i) {
//				if (str.charAt(i) == '-') {
//					continue;
//				}
				sum += str.charAt(i) - '0';
			}
			System.out.println(sum % 3 == 0 ? "yes" : "no");
		}
	}
}
