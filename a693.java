import java.util.Scanner;

public class a693 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, m;

		while (scan.hasNext()) {
			n = scan.nextInt();
			m = scan.nextInt();

			int[] oneToNFoodSum = new int[n + 1];

			for (int i = 1; i <= n; ++i) {
				oneToNFoodSum[i] = oneToNFoodSum[i - 1] + scan.nextInt();
			}

			for (int i = 0; i < m; ++i) {
				int l = scan.nextInt();
				int r = scan.nextInt();

				System.out.println(oneToNFoodSum[r] - oneToNFoodSum[l - 1]);
			}
		}
		scan.close();
	}
}