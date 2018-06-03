import java.util.Scanner;

public class c418 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int j = 1; j <= n; ++j) {				

				for (int i = 1; i <= j; i++) {
					System.out.print("*");
				}				
				
				System.out.println();
			}
		}
		scan.close();
	}
}