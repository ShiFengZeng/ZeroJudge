import java.util.Scanner;

public class a624 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			str = scan.next();

			boolean isgreat8 = false;
			boolean hasLower = false;
			boolean hasUpper = false;
			boolean hasNumberOrSymbol = false;

			if (str.length() >= 8) {
				isgreat8 = true;
			}
			for (int i = 0; i < str.length(); ++i) {
				if (Character.isLowerCase(str.charAt(i))) {
					hasLower = true;
				} else if (Character.isUpperCase(str.charAt(i))) {
					hasUpper = true;
				} else {
					hasNumberOrSymbol = true;
				}
			}
			boolean hasLowerAndUpper = hasLower && hasUpper;
			boolean hasLetterAndNumOrSymbol = (hasLower || hasUpper) && hasNumberOrSymbol;

			if (isgreat8 && hasLowerAndUpper && hasNumberOrSymbol) {
				System.out.println("This password is STRONG");
			} else if (!isgreat8 && !hasLowerAndUpper && !hasLetterAndNumOrSymbol) {
				System.out.println("This password is WEAK");
			} else if ((isgreat8 && hasLowerAndUpper) || (isgreat8 && hasLetterAndNumOrSymbol)
					|| (hasLowerAndUpper && hasLetterAndNumOrSymbol)) {
				System.out.println("This password is GOOD");
			} else {
				System.out.println("This password is ACCEPTABLE");
			}
		}
		scan.close();
	}
}