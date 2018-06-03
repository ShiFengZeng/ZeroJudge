import java.util.Scanner;

public class d187 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String letter = "12312312312312312341231234";
		while (scan.hasNext()) {
			n = scan.nextInt();
			String str = scan.nextLine();

			for (int i = 0; i < n; ++i) {
				int count = 0;
				str = scan.nextLine();

				for (int j = 0; j < str.length(); ++j) {
					int num = str.charAt(j) - 'a';
					if (num != -65) { // space
						System.out.println(letter.charAt(num));
						count += Integer.valueOf(letter.charAt(num) - '0');
					} else {
						count++;
					}
				}

				System.out.println(String.format("Case #%d: %d", i + 1, count));
			}

		}
		scan.close();
	}
}