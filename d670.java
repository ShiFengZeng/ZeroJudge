import java.util.Scanner;

public class d670 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		String letter = "22233344455566677778889999";
		while (scan.hasNext()) {
			str = scan.nextLine();

			for (int i = 0; i < str.length(); ++i) {
				if (str.charAt(i) == '-' || str.charAt(i) == '1' || str.charAt(i) == '0') {
					System.out.print(str.charAt(i));
				} else {
					int temp = str.charAt(i) - 'A';
					System.out.print(letter.charAt(temp));
				}
			}
			System.out.println();
		}
		scan.close();
	}
}