import java.util.Scanner;

public class d442 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, N;

		while (scan.hasNext()) {
			N = scan.nextInt();

			for (int i = 0; i < N; ++i) {				
				n = scan.nextInt();
				int sum = calHappyNumber(n);
				
				while (sum != 1) {
					sum = calHappyNumber(sum);
					if (sum == 4) {
						break;
					}
				}

				System.out.print(String.format("Case #%d: %d is ", i + 1, n));

				if (sum == 1 || n == 1)
					System.out.println("a Happy number.");
				else
					System.out.println("an Unhappy number.");

			}
		}
		scan.close();
	}

	public static int calHappyNumber(int n) {
		int sum = 0;

		while (n != 0) {
			sum += (n % 10) * (n % 10);
			n /= 10;
		}

		return sum;
	}
}