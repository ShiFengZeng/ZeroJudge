import java.util.Scanner;

public class b676 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			if (n % 5 == 0)
				System.out.println("U");
			else if (n % 5 == 1)
				System.out.println("G");
			else if (n % 5 == 2)
				System.out.println("Y");
			else if (n % 5 == 3)
				System.out.println("T");
			else
				System.out.println("I");
		}
		scan.close();
	}
}