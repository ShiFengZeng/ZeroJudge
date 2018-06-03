import java.util.Scanner;

public class a011 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			int count = 1;
			boolean isBlank = false;

			char[] ch = str.toCharArray();
			for (char c : ch) {
				if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '.' || c == '!')) {
					isBlank = true;
				} else if (isBlank) {
					count++;
					isBlank = false;
				}
			}
			System.out.println(count + " ");
		}
	}
}
