import java.util.Scanner;

public class b553 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			System.out.println(calCollatz(n));
		}
		scan.close();
	}

	static int collatz(int num) {
		if (num % 2 == 0) {
			num /= 2;
		} else {
			num = 3 * num + 1;
		}
		return num;
	}

	static int calCollatz(int num) {
		int count = 0;

		while (num > 1) {
			count++;
			num = collatz(num);
		}
		return count;
	}
}