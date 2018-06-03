import java.util.Scanner;

public class d171 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		int m;
		while (scan.hasNext()) {
			n = scan.nextInt();
			m = scan.nextInt();

			System.out.println((int) (m * Math.log10(n) + 1));
		}
		scan.close();
	}
}
