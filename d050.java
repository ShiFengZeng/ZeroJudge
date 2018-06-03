import java.util.Scanner;

public class d050 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int h = scan.nextInt();
			System.out.println((h + 9) % 24);
		}
	}
}
