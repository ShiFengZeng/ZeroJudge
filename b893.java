import java.util.Scanner;

public class b893 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d, e, f;
		// int ans;
		while (scan.hasNext()) {
			a = scan.nextInt(); // x5
			b = scan.nextInt(); // x4
			c = scan.nextInt(); // x3
			d = scan.nextInt(); // x2
			e = scan.nextInt(); // x1
			f = scan.nextInt(); // c

			// if (a != 0) {
			// ans = 5;
			// } else if (b != 0) {
			// ans = 4;
			// } else if (c != 0) {
			// ans = 3;
			// } else if (d != 0) {
			// ans = 2;
			// } else if (e != 0) {
			// ans = 1;
			// } else {
			// ans = 0;
			// }
			boolean isSolution = false;
			if (a == b && b == c && c == d && d == e && e == f && f == 0) {
				System.out.println("Too many... = =\"");
				isSolution = true;
			} else {
				for (int x = -40; x <= 40; ++x) {
					if ((a * Math.pow(x, 5) + b * Math.pow(x, 4) + c * Math.pow(x, 3) + d * Math.pow(x, 2) + e * x + f)
							* (a * Math.pow(x + 1, 5) + b * Math.pow(x + 1, 4) + c * Math.pow(x + 1, 3)
									+ d * Math.pow(x + 1, 2) + e * (x + 1) + f) < 0) {
						System.out.println(x + " " + (x + 1));
						isSolution = true;
					} else if ((a * Math.pow(x, 5) + b * Math.pow(x, 4) + c * Math.pow(x, 3) + d * Math.pow(x, 2)
							+ e * x + f) == 0) {
						System.out.println(x + " " + x);
						isSolution = true;
					}
				}
			}
			if (!isSolution) {
				System.out.println("N0THING! >\\\\\\<");
			}
		}
		scan.close();
	}
}