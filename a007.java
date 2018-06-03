import java.util.Scanner;

public class a007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			boolean isPrime = true;

			int x = scan.nextInt();

			if (x % 2 == 0 && x != 2) {
				System.out.println("獶借计");
				isPrime = false;
			} else if (x % 3 == 0 && x != 3) {
				System.out.println("獶借计");
				isPrime = false;
			} else if (x % 5 == 0 && x != 5) {
				System.out.println("獶借计");
				isPrime = false;
			} else if (x % 7 == 0 && x != 7) {
				System.out.println("獶借计");
				isPrime = false;
			}
			
			if (isPrime) {
				for (int j = 11; j <= Math.sqrt(x); j += 2) {
					if (x % j == 0) {
						System.out.println("獶借计");
						isPrime = false;
						break;
					}
				}
			}

			if (isPrime) {
				if (x == 1) {
					System.out.println("獶借计");
				} else {
					System.out.println("借计");
				}
			}
		}
		scan.close();
	}
}
