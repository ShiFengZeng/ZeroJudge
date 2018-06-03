import java.util.Scanner;

public class d071 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y = 0;
		while (scan.hasNext()) {
			y = scan.nextInt();			
			
			isLeapYearOrNot(y);

		}
		scan.close();
	}

	public static void isLeapYearOrNot(int i) {
		if (i % 4 == 0) {
			if (i % 100 == 0) {
				if (i % 400 == 0) {
					System.out.println("a leap year");
				} else {
					System.out.println("a normal year");
				}
			} else {
				System.out.println("a leap year");
			}
		} else {
			System.out.println("a normal year");
		}
	}
}
