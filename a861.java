import java.util.Scanner;

public class a861 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w, h;

		while (scan.hasNext()) {
			w = scan.nextInt();
			h = scan.nextInt();

			System.out.println((w + h) *2);
		}
		scan.close();
	}
}