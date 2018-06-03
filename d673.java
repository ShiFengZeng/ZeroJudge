import java.util.Scanner;

public class d673 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int stock;
		int n = 1;
		while (scan.hasNext()) {
			stock = scan.nextInt();
			int[] ready = new int[14];
			int[] need = new int[13];

			if (stock < 0)
				break;

			for (int i = 2; i <= 13; ++i) {
				ready[i] = scan.nextInt();
			}
			for (int i = 1; i <= 12; ++i) {
				need[i] = scan.nextInt();
			}

			ready[1] = stock;
			System.out.println(String.format("Case %d:", n));
			for (int j = 1; j <= 12; ++j) {
				ready[j] += ready[j - 1];
				if (ready[j] >= need[j]) {
					ready[j] -= need[j];
					System.out.println("No problem! :D");
				} else {
					System.out.println("No problem. :(");
				}
			}
			n++;

		}
		scan.close();
	}
}