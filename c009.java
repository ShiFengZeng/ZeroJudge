import java.util.Scanner;

public class c009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			str = scan.nextLine();

			if (str.equals("-1")) {
				break;
			} else {
				if (str.charAt(0) == '0' && str.charAt(1) == 'x') {
					System.out.println(Long.parseLong(str.substring(2), 16));
				} else {
					System.out.println("0x" + Long.toHexString(Integer.valueOf(str)).toUpperCase());
				}
			}
		}
		scan.close();
	}
}