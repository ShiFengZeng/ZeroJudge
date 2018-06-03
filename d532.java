import java.util.Scanner;

public class d532 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int count = 0;
		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();

			for (int i = a; i <= b; ++i) {
				count = isLeapYearOrNot(i);
			}
			System.out.println(count);
		}
		scan.close();
	}

	static int leap = 0;

	public static int isLeapYearOrNot(int i) {
		if (i % 4 == 0) {
			if (i % 100 == 0) {
				if (i % 400 == 0) {
					leap++;
				}
			} else {
				leap++;
			}
		}
		return leap;
	}
}
