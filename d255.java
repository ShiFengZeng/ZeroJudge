import java.util.Scanner;

public class d255 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			long G = 0;
			int N = scan.nextInt();

			if (N == 0) {
				break;
			}
			for (int i = 1; i < N; i++) {
				for (int j = i + 1; j <= N; j++) {
					G += gcd(i, j);
				}
			}
			System.out.println(G);
		}
	}

	public static int gcd(int a, int b) {
		int result = a % b;
		while (result > 0) {
			a = b;
			b = result;
			result = a % b;
		}
		result = b;

		return result;
	}
}
