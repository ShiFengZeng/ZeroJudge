import java.util.Scanner;

public class c315 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;

		final int direction[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int x = 0;
		int y = 0;

		while (scan.hasNext()) {
			N = scan.nextInt();

			for (int i = 0; i < N; ++i) {
				int a = scan.nextInt();
				int b = scan.nextInt();

				x += direction[a][0] * b;
				y += direction[a][1] * b;
			}
			System.out.println(x + " " + y);
		}
		scan.close();
	}
}