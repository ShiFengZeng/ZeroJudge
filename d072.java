import java.util.Scanner;

public class d072 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y = 0;
		int n = 0;
		String result = "";
		while (scan.hasNext()) {
			n = scan.nextInt();
			for (int i = 0; i < n; ++i) {
				y = scan.nextInt();
				result = isLeapYearOrNot(y);
				System.out.println(String.format("Case %d: %s ", i + 1, result));
			}

		}
		scan.close();
	}

	public static String isLeapYearOrNot(int i) {
		if (i % 4 == 0) {
			if (i % 100 == 0) {
				if (i % 400 == 0) {
					return "a leap year";
				} else {
					return "a normal year";
				}
			} else {
				return "a leap year";
			}
		} else {
			return "a normal year";
		}
	}
}
