import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a121 {
	public static void main(String[] args) {
		List<Integer> primeList = new ArrayList<>();
		primeList.add(2);
		primeList.add(3);
		primeList.add(5);
		primeList.add(7);
		for (int i = 11; i <= 10000; i += 2) {
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
		int a;
		int b;
		while (scan.hasNext()) {
			int primeCount = 0;
			a = scan.nextInt();
			b = scan.nextInt();
			for (int j = a; j <= b; ++j) {
				boolean isPrime = true;
				for (int i = 0; i < primeList.size(); ++i) {
					if (j % primeList.get(i) == 0 && j != primeList.get(i)) {
						isPrime = false;
						break;
					}					
				}
				if (isPrime) {
					primeCount++;
				}
			}
			if (a == 1) {
				primeCount--;
			}
			System.out.println(primeCount);
		}
		scan.close();
	}
}
