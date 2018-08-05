import java.util.Scanner;

public class c006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int pos = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int degree = 120;

			if (a == 0 && b == 0 && c == 0 && pos == 0) {
				break;
			} else {
				// °f¶¶°f
				degree += (40 + pos - a) % 40;
				degree += (40 - a + b) % 40;
				degree += (40 + b - c) % 40;
				degree *= 9;
				System.out.println(degree);
			}
		}
		scan.close();
	}
}