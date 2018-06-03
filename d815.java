import java.util.Scanner;

public class d815 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			if (a == b) {
				System.out.println("= =\"");
			} else {
				System.out.println(">\\\\\\<");
			}
		}
	}
}
