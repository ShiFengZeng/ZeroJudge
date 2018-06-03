import java.util.Scanner;

public class c054 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		String s = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		while (scan.hasNext()) {
			str = scan.nextLine();

			for (int i = 0; i < str.length(); ++i) {
				int temp = s.indexOf(str.charAt(i));
				if (temp >= 0) {
					System.out.print(s.charAt(temp - 1));
				} else {
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
		scan.close();
	}
}