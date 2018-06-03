import java.util.ArrayList;
import java.util.Scanner;

public class a013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String s1 = scan.next();
			if (s1.equals("#")) {
				break;
			}
			String s2 = scan.next();

			

			int a1 = toNumber(s1);
			int a2 = toNumber(s2);

			int a3 = Math.abs(a1 - a2);

			if (a3 == 0) {
				System.out.println("ZERO");
			}

			for (String temp : toRomanNumerals(a3)) {
				System.out.print(temp);
			}
			System.out.println();
		}
	}

	private static final String[] romanNumeralsArray = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
			"IX", "V", "IV", "I" };
	private static final int[] numArray = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	public static ArrayList<String> toRomanNumerals(int n) {

		ArrayList<String> arrList = new ArrayList<>();

		for (int i = 0; i < numArray.length; ++i) {
			while (n >= numArray[i]) {
				arrList.add(romanNumeralsArray[i]);
				n -= numArray[i];
			}
		}

		return arrList;
	}

	public static int toNumber(String s) {

		int n = 0;
		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; sb.length() > 0 && i < romanNumeralsArray.length; ++i) {
			while (sb.indexOf(romanNumeralsArray[i]) == 0) {
				n += numArray[i];
				sb.delete(0, romanNumeralsArray[i].length());
			}
		}

		return n;
	}
}
