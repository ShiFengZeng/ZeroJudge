import java.util.Scanner;

public class c466 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			int count = 0;
			int numPosition = 0;
			str = scan.next();

			for (int i = 0; i < str.length(); ++i) {
				if (str.charAt(i) == '-') {
					count++;
				} else {
					numPosition = i;
					break;
				}
			}

			if (count % 2 == 1) {
				if (str.charAt(numPosition) != '0')
					System.out.print("-");
			}
			for (int j = numPosition; j < str.length(); ++j) {
				System.out.print(str.charAt(j));
			}
			System.out.println();

		}
		scan.close();
	}
}