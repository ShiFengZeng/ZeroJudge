import java.util.Scanner;

public class c469 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			System.out.println(n - (int) Math.sqrt(n) * (int) Math.sqrt(n));
		}
		scan.close();
	}
}