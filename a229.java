import java.util.Scanner;

public class a229 {
	static int n = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			n = scan.nextInt();
			char[] c = new char[2 * n];
			go(c, 0, 0, 0);
		}
		scan.close();
	}

	public static void go(char[] c, int index, int left, int right) {
		if (right > left) {
			return;
		}

		if (n == left && n == right) {
			System.out.println(c);
			return;
		}

		if (left < n) {
			c[index] = '(';
			go(c, index + 1, left + 1, right);
			c[index] = ' ';
		}

		if (right < n) {
			c[index] = ')';
			go(c, index + 1, left, right + 1);
			c[index] = ' ';
		}
	}
}
