import java.util.Scanner;

public class a273 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, k;

		while (scan.hasNext()) {
			n = scan.nextInt();
			k = scan.nextInt();
			if (k == 0 && n != 0)
				System.out.println("Impossib1e!");
			else if (k == 0 && n == 0)
				System.out.println("Ok!");
			else if (n % k == 0)
				System.out.println("Ok!");
			else
				System.out.println("Impossib1e!");
		}
		scan.close();
	}
}