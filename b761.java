import java.util.Scanner;

public class b761 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			if (n % 4 == 0) {
				System.out.println("egg");
			} else {
				System.out.println("fat");
			}
		}
		scan.close();
	}
}