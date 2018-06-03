import java.util.Scanner;

public class a518 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();

			if (a == -1 && b == -1) {
				break;
			}

			System.out.println(Math.min(Math.abs(a - b), 100 - Math.abs(a - b)));
		}
		scan.close();
	}
}