import java.util.Scanner;

public class d086 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.next();
			int sum = 0;

			if (str.equals("0")) {
				break;
			}

			str = str.toUpperCase();
			for (int i = 0; i < str.length(); ++i) {
				if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
					sum += str.charAt(i) - 64;
				} else {
					sum = 0;
					break;
				}
			}
			System.out.println(sum > 0 ? sum : "Fail");
		}
	}
}
