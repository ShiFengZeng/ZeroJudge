import java.util.Scanner;

public class d098 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		try {
			while (scan.hasNext()) {
				str = scan.nextLine();

				System.out.println(getNumberSum(str));
			}
		} catch (Exception ex) {
			System.out.println("0");
		}
		scan.close();
	}

	public static int getNumberSum(String str) {
		String[] s = str.split("[ ]+");
		int sum = 0;

		for (int i = 0; i < s.length; ++i) {
			sum += getNumber(s[i]);
		}

		return sum;
	}

	public static int getNumber(String str) {
		if (isNumber(str)) {
			return Integer.parseInt(str);
		}

		return 0;
	}

	public static boolean isNumber(String str) {
		if (str.matches("\\d+")) {
			return true;
		}
		return false;
	}
}