import java.util.Scanner;

public class a135 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		int i = 1;
		String language;
		while (scan.hasNext()) {
			str = scan.next();

			if (str.equals("#"))
				break;
			else if (str.equals("HELLO"))
				language = "ENGLISH";
			else if (str.equals("HOLA"))
				language = "SPANISH";
			else if (str.equals("HALLO"))
				language = "GERMAN";
			else if (str.equals("BONJOUR"))
				language = "FRENCH";
			else if (str.equals("CIAO"))
				language = "ITALIAN";
			else if (str.equals("ZDRAVSTVUJTE"))
				language = "RUSSIAN";
			else {
				language = "UNKNOWN";
			}

			System.out.println(String.format("Case %d: %s", i, language));
			i++;

		}
		scan.close();
	}
}