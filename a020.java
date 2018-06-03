import java.util.Scanner;

public class a020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] numberIndex = new int[] { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27,
				28, 29, 32, 30, 31, 33 };

		while (scan.hasNext()) {
			String str = scan.nextLine();
			//р璣ゅ锣てΘ癸莱计 钡计
			str = numberIndex[str.charAt(0) - 'A'] + str.substring(1);

			int sum = str.charAt(0) - '0';// 材计
			for (int i = 1; i <= 9; ++i) {
				sum += (str.charAt(i) - '0') * (10 - i);
			}
			sum = sum + str.charAt(10) - '0';// 程计

			if (sum % 10 == 0) {
				System.out.println("real");
			} else {
				System.out.println("fake");
			}
		}
	}
}
