import java.util.Scanner;

public class c203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int num;
		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int j = 0; j < n; ++j) {
				num = scan.nextInt();
				int sum = 0;

				for (int i = 1; i <= num / 2; ++i) {
					if (num % i == 0) {
						sum += i;
					}
				}

				if (sum == num) {
					System.out.println("perfect");
				} else if (sum < num) {
					System.out.println("deficient");
				} else {
					System.out.println("abundant");
				}
			}
		}
		scan.close();
	}
}