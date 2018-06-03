import java.util.Scanner;

public class a054 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char[] letterIndex = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int[] numberIndex = new int[] { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27,
				28, 29, 32, 30, 31, 33 };

		// int[] numberSumOnesDigit = new int[] { 1 % 10, (1 + 1 * 9) % 10, (1 + 2 * 9)
		// % 10 }.........;
		// 璣ゅ锣计(そΑ)羆 计
		// int[] numberSumOnesDigit = new int[] { 1, 0, 9, 8, 7, 6, 5, 4, 9, 3, 2, 2, 1,
		// 0, 8, 9, 8, 7, 6, 5, 4, 3, 1, 3,
		// 2, 0 };
		int[] numberSumOnesDigit = new int[] { 1 + 9 * 0, 1 + 9 * 1, 1 + 9 * 2, 1 + 9 * 3, 1 + 9 * 4, 1 + 9 * 5,
				1 + 9 * 6, 1 + 9 * 7, 3 + 9 * 4, 1 + 9 * 8, 1 + 9 * 9, 2 + 0 * 9, 2 + 1 * 9, 2 + 2 * 9, 3 + 5 * 9,
				2 + 3 * 9, 2 + 4 * 9, 2 + 5 * 9, 2 + 6 * 9, 2 + 7 * 9, 2 + 8 * 9, 2 + 9 * 9, 3 + 2 * 9, 3 + 0 * 9,
				3 + 1 * 9, 3 + 3 * 9 };
		while (scan.hasNext()) {
			String str = scan.nextLine();
			int sum = 0;

			// 块9羆
			for (int i = 0; i < str.length() - 1; ++i) {
				sum += (str.charAt(i) - '0') * (8 - i);
			}
			int c = str.charAt(8) - '0';
			if (c == 0) {
				c = 10;
			}

			// 璣ゅ锣计(そΑ)羆 计
			// 10- 羆计 == 程絏(浪琩絏)
			for (int j = 0; j < numberSumOnesDigit.length; ++j) {
				if ((10 - ((numberSumOnesDigit[j]) + sum) % 10) == c) {
					System.out.print(letterIndex[j]);
				}
			}
			System.out.println();
		}
	}
}
