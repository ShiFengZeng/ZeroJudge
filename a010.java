import java.util.Scanner;

public class a010 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int s;

		while (scan.hasNextInt()) {
			s = scan.nextInt();
			boolean isFirst = true;

			for (int i = 2; i <= s; ++i) {
				int count = 0;
				while (s % i == 0) {
					s /= i;
					count++;
				}
				if (count > 0) {
					if (isFirst) {
						if (count == 1) {
							System.out.print(i);
						} else {
							System.out.print(i + "^" + count);
						}
						isFirst = false;
					} else {
						if (count == 1) {
							System.out.print(" * " + i);
						} else {
							System.out.print(" * " + i + "^" + count);
						}
					}
				}
			}
			System.out.println();
		}
	}
}