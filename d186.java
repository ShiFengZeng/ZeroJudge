import java.util.Scanner;

public class d186 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			if (a == 0 && b == 0) {
				break;
			}
			System.out.println(getSquareNumbers(a, b));
		}
	}

	public static int getSquareNumbers(int a, int b) {
		int total = 0;

		for (int i = (int) Math.sqrt(a); i * i <= b; ++i) {
			if (i * i >= a && i * i <= b)
				total++;
		}
		return total;
	}
}