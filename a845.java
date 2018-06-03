import java.util.Scanner;

public class a845 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int ask;
		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] price = new int[n];
			for (int i = 0; i < n; ++i) {
				price[i] = scan.nextInt();
			}
			ask = scan.nextInt();
			for (int j = 0; j < ask; ++j) {
				int x = scan.nextInt();
				int y = scan.nextInt();

				System.out.println(price[x] + price[y]);
			}
		}
		scan.close();
	}
}