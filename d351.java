import java.util.Scanner;

public class d351 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			try {
				str = scan.nextLine();
				String letter = new String();

				for (int i = 1; i < str.length() - 1; i++) {
					if (str.charAt(i) == ' ') {
						letter += "0";
					} else if (str.charAt(i) == 'o') {
						letter += "1";
					}
				}
				System.out.print((char) (Integer.parseInt(letter, 2)));
			} catch (Exception ex) {

			}
		}
		scan.close();
	}
}