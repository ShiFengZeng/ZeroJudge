import java.util.Scanner;

public class d103 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			str = scan.next();

			int j = 1;
			int num = 0;
			char identifier = 0;
			for (int i = 0; i < str.length() - 2; ++i) {
				if (str.charAt(i) != '-') {
					num += (str.charAt(i) - '0') * j;
					j++;
				}
			}
			identifier = (char) ((num % 11) + '0');
			if (identifier == ':')
				identifier = 'X';

			if (identifier == str.charAt(str.length() - 1)) {
				System.out.println("Right");
			} else {
				for (int i = 0; i < str.length() - 1; ++i) {
					System.out.print(str.charAt(i));
				}
				System.out.println(identifier);
			}
		}
		scan.close();
	}
}