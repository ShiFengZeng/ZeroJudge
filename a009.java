import java.util.Scanner;

public class a009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int K = 7;

			String s = scan.nextLine();
			int len = s.length();

			for (int i = 0; i < len; i++) {
				int j = s.charAt(i);
				char code =(char) ((char) j - K);
				System.out.print(code);
			}
			System.out.println();
		}
	}
}
