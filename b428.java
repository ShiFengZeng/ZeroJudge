import java.util.Scanner;

public class b428 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1, str2;

		while (scan.hasNext()) {
			str1 = scan.next();
			str2 = scan.next();

			System.out.println(((str2.charAt(0) - str1.charAt(0)) + 26) % 26);
		}
		scan.close();
	}
}