import java.util.Scanner;

public class d649 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int i = 1; i <= n; i++) {
				for(int j=n-i;j>0;j--) {
					System.out.print("_");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("+");
				}
				System.out.println();
			}
		}
	}
}
