import java.util.Scanner;

public class c014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			int carry = 0; // 次數
			int hasCarry = 0; // 有進位1 沒進位0

			if (a == 0 && b == 0)
				break;

			while (a != 0 || b != 0) {
				if (a % 10 + b % 10 + hasCarry >= 10) {
					carry++;
					hasCarry = 1;
				} else {
					hasCarry = 0;
				}
				a /= 10;
				b /= 10;
			}
			

			if (carry == 0) {
				System.out.println("No carry operation.");
			} else if (carry == 1) {
				System.out.println("1 carry operation.");
			} else {
				System.out.println(String.format("%d carry operations.", carry));
			}
		}
		scan.close();
	}
}