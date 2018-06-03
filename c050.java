import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c050 {

	public static void main(String[] args) {

		List<Integer> primeList = new ArrayList<>();
		primeList.add(2);
		primeList.add(3);
		primeList.add(5);
		primeList.add(7);
		for (int i = 11; i <= 1000; i += 2) {
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); ++j) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeList.add(i);
			}
		}

		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {

			n = scan.nextInt();

//			if (n == 0) {
//				break;
//			}

			for (int i = 0; i < primeList.size(); ++i) {
				boolean isPrime = true;
				int temp = n - primeList.get(i);

				for (int j = 0; j < primeList.size(); ++j) {
					if (temp % primeList.get(j) == 0 && temp != primeList.get(j)) {
						isPrime = false;
						break;
					}
				}

				if (isPrime) {
					System.out.println(String.format("%d = %d + %d", n, primeList.get(i), temp));
					break;
				}
			}
		}
		scan.close();
	}
}