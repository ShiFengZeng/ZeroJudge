import java.util.Scanner;

public class a244 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				int a = scan.nextInt();
				long b = scan.nextInt();
				long c = scan.nextInt();

				switch (a) {
				case 1:
					System.out.println(b + c);
					break;
				case 2:
					System.out.println(b - c);
					break;
				case 3:
					System.out.println(b * c);
					break;
				case 4:
					System.out.println(b / c);
					break;
				}
			}
		}
	}
}
