import java.util.Scanner;

public class c164 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int k = scan.nextInt();
			int[] nFirst = new int[k + 1];
			int sum = 0;

			nFirst[1] = 1;
			if (k == 1) {
				System.out.println("1");
			}
			if (k > 1) {
				for (int i = 2; i <= k; ++i) {
					nFirst[i] += nFirst[i - 1] + i;
					sum += i * i;
					if (nFirst[i] >= k) {
						System.out.println(sum - (nFirst[i] - k) * i + 1);
						break;
					}
				}
			}
		}
	}
}
