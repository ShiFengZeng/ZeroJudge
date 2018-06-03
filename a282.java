import java.util.Scanner;

public class a282 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;	

		while (scan.hasNext()) {
			n = scan.nextInt();
			boolean[] bookPage = new boolean[2001];
			for (int i = 0; i < n; ++i) {
				int page = scan.nextInt();
				bookPage[page] = true;
			}

			for (int i = 1; i <= 2000; ++i) {
				if (bookPage[i] == false) {
					System.out.println(i);
					break;
				}
			}
		}
		scan.close();
	}
}