import java.util.Scanner;

public class d672 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			str = scan.nextLine();
			int degree = 0;
			int sum = 0;

			if (!str.equals("0")) {
				sum = _9Degree(str);
				while (sum % 9 == 0) {
					degree++;
					if (sum != 9) {
						sum = Integer.valueOf(_9Degree(String.valueOf(sum)));
					} else {
						break;
					}
				}
				if (degree != 0) {
					System.out.println(String.format("%s is a multiple of 9 and has 9-degree %d.", str, degree));
				} else {
					System.out.println(String.format("%s is not a multiple of 9.", str));
				}
			} else {
				break;
			}
		}
		scan.close();
	}

	public static int _9Degree(String s) {
		int sum = 0;

		for (int i = 0; i < s.length(); ++i) {
			sum += s.charAt(i) - '0';
		}

		return sum;
	}
}