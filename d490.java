import java.util.Scanner;

public class d490 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int evenAdd = 0;

			for (int i = a; i <= b; ++i) {
				if (i % 2 == 0) {
					evenAdd += i;
				}
			}
			System.out.println(evenAdd);
		}
	}
}
