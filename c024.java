import java.util.Scanner;

public class c024 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n;

		while (scan.hasNext()) {
			n = scan.nextLong();
			if (n < 0)
				break;

			System.out.println(n * (n + 1) / 2 + 1);
		}
		scan.close();
	}
}