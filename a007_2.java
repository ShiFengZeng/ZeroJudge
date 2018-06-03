import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a007_2 {
	public static void main(String[] args) {
		List<Integer> primeList = new ArrayList<>();
		primeList.add(2);
		primeList.add(3);
		primeList.add(5);
		primeList.add(7);
		for (int i = 11; i <= 46340; i += 2) {
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
		int x;
		while (scan.hasNext()) {
			boolean isPrime = true;
			x = scan.nextInt();
			for (int i = 0; i < primeList.size(); ++i) {
				if (x % primeList.get(i) == 0 && x != primeList.get(i)) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				if (x == 1) {
					System.out.println("非質數");
				} else {
					System.out.println("質數");
				}
			} else {
				System.out.println("非質數");
			}
		}
		scan.close();
	}
}
