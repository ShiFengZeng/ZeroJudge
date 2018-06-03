import java.util.Arrays;
import java.util.Scanner;

public class b515 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] code = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };

		int n;
		while (scan.hasNext()) {
			n = scan.nextInt();
			String str = scan.nextLine();

			for (int i = 0; i < n; ++i) {
				str = scan.nextLine();
				String[] s = str.split("[ ]+");
				for (int j = 0; j < s.length; ++j) {
					System.out.print(String.format("%c", Arrays.asList(code).indexOf(s[j]) + 'A'));
				}
				System.out.println();
			}
		}
		scan.close();
	}
}