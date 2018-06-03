import java.util.Scanner;

public class b294 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int sum = 0;

			for (int i = 0; i < n; ++i) {
				int a = scan.nextInt();
				sum += (i + 1) * a;
			}
			System.out.println(sum);
		}
	}
}
