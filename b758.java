import java.util.Scanner;

public class b758 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int hour = scan.nextInt();
			int minute = scan.nextInt();

			minute = minute + 30;
			hour = hour + (minute / 60) + 2;
			System.out.print(hour / 24 >= 1 || hour % 24 < 10 ? "0" + hour % 24 + ":" : hour % 24 + ":");
			System.out.print(minute % 60 < 10 ? "0" + minute % 60 : minute % 60);
			System.out.println();
		}
	}
}
