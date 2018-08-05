import java.util.Scanner;

public class c461 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		int and;
		int or;
		int xor;
		boolean hasSol;
		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			hasSol = false;

			if (a != 0 && b != 0)
				and = 1;
			else
				and = 0;

			if (a == 0 && b == 0)
				or = 0;
			else
				or = 1;

			if ((a != 0 && b == 0) || (a == 0 && b != 0))
				xor = 1;
			else
				xor = 0;

			if (and == c) {
				System.out.println("AND");
				hasSol = true;
			}
			if (or == c) {
				System.out.println("OR");
				hasSol = true;
			}
			if (xor == c) {
				System.out.println("XOR");
				hasSol = true;
			}
			if (!hasSol)
				System.out.println("IMPOSSIBLE");
		}
		scan.close();
	}
}