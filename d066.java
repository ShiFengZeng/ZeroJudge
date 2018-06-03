import java.util.Scanner;

public class d066 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int h = scan.nextInt();
			int m = scan.nextInt();

			if (h > 7 && h < 17) {
				System.out.println("At School");
			} else if (h == 7 && m >= 30) {
				System.out.println("At School");
			} else {
				System.out.println("Off School");
			}
		}
	}
}
