import java.util.Scanner;

public class d461 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			System.out.println(n-1);
		}
		scan.close();
	}
}