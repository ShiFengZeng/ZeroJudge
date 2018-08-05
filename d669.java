import java.util.Scanner;

public class d669 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h1, m1, h2, m2;
		int min, hour;
		while (scan.hasNext()) {
			h1 = scan.nextInt();
			m1 = scan.nextInt();
			h2 = scan.nextInt();
			m2 = scan.nextInt();

			if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
				break;
			} else {
				min = m2 - m1;
				if (min < 0) {
					h2--;
					min += 60;
				}

				hour = h2 - h1;
				min += hour * 60;
				if (min < 0) {
					min += 24 * 60;
				}
				System.out.println(min);
			}
		}
		scan.close();
	}
}