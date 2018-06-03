import java.util.Scanner;

public class a686 {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n;
		int X, Y, Z;
		StringBuilder sb = new StringBuilder();

		while (scan.hasNext()) {
			n = scan.nextInt();
			for (int i = 0; i < n; ++i) {
				boolean isStandStill = false;
				X = scan.nextInt();
				Y = scan.nextInt();
				Z = scan.nextInt();
				int height = 0;
				int day = 0;
				do {
					day++;
					height += Y;
					if (height >= X) {
						break;
					} else if (Y == Z) {
						isStandStill = true;
						break;
					}
					height -= Z;
				} while (height >= 0);

				if (height < 0 || isStandStill) {
					sb.append("Poor Snail\n");
				} else {
					sb.append(day + "\n");
				}
			}
			System.out.print(sb);
		}
		scan.close();
	}
}