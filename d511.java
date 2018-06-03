import java.util.Scanner;

public class d511 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int sum = 0;

			for (int i = 0; i < 5; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = scan.nextInt();
				if (a + b > c && a + c > b && b + c > a) {
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}
