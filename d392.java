import java.util.Scanner;

public class d392 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.nextLine();
			long sum = 0;

			String[] c = str.split(" ");

			for (int i = 0; i < c.length; ++i) {
				if (!c[i].isEmpty())
					sum += Long.valueOf(c[i]);
			}
			System.out.println(sum);
		}
	}
}
