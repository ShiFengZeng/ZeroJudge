import java.util.Scanner;

public class a042 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int result = a * a - a + 2;

			System.out.println(result);
		}
	}
}
