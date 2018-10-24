import java.util.ArrayList;
import java.util.Scanner;

public class a275 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str1 = scan.next();

			int same = 0;
			ArrayList<String> found = new ArrayList<>();

			if (str1.equals("STOP!!")) {
				break;
			}
			String str2 = scan.next();

			for (int i = 0; i < str1.length(); ++i) {
				for (int j = 0; j < str2.length(); ++j) {
					if (str2.charAt(j) == str1.charAt(i) && found.indexOf(String.valueOf(j)) == -1) {
						found.add(String.valueOf(j));
						same++;
						break;
					}
				}
			}
			if (same == str1.length()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
