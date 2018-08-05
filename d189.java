import java.util.Scanner;

public class d189 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int sum = 0;
			sum = n;

			while (n > 1) {
				if (n == 2) {
					n += 1;
				}
				sum += n / 3;
				n = n / 3 + n % 3;
			}
			System.out.println(sum);
		}
		scan.close();
	}
}
