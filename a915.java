import java.util.Scanner;

public class a915 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int x[] = new int[n];
			int y[] = new int[n];

			for (int i = 0; i < n; ++i) {
				x[i] = scan.nextInt();
				y[i] = scan.nextInt();
			}
			for (int i = 0; i < n - 1; ++i) {
				for (int j = i + 1; j < n; ++j) {
					if (x[i] > x[j]) {
						int tempX = x[i];
						x[i] = x[j];
						x[j] = tempX;

						int tempY = y[i];
						y[i] = y[j];
						y[j] = tempY;
					} else if (x[i] == x[j]) {
						if (y[i] > y[j]) {
							int tempY = y[i];
							y[i] = y[j];
							y[j] = tempY;
						}
					}
				}
			}
			for (int i = 0; i < n; ++i) {
				System.out.println(x[i] + " " + y[i]);
			}
		}
		scan.close();
	}
}