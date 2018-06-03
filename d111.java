import java.util.Scanner;

public class d111 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			if (n == 0) {
				break;
			}
			if (isExactSquareNumber(n) == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

	public static boolean isExactSquareNumber(int num) {
		double doubleNum = Math.sqrt(num);
		int intNum = (int) doubleNum;

		if (doubleNum == intNum) {
			return true;
		} else {
			return false;
		}
	}
}