import java.util.Scanner;

public class d881 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int a = 1;
			int i = 1;
			int sum = 0;
			int n = 1;

			int d = scan.nextInt();

			while (n < 50) {
				a = a + i;
				i += d;
				sum += a;
				n++;
			}
			System.out.println(sum + 1);
		}
	}
}
