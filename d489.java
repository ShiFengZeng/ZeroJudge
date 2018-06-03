import java.util.Scanner;

public class d489 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int s = (a + b + c) / 2;

			System.out.println(s * (s - a) * (s - b) * (s - c));
		}
	}
}
