import java.util.Scanner;

public class d705 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		int upValue = (int) Math.sqrt(Integer.MAX_VALUE);
		boolean[] isNotPrime = new boolean[upValue + 1];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int a = 2; a * a <= upValue; ++a) {
			if (!isNotPrime[a]) {
				for (int b = a * a; b <= upValue; b += a) {
					isNotPrime[b] = true;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			n = scan.nextInt();
			boolean isPrime = true;

			if (n <= upValue) {
				if (n == 0) {
					System.out.println(sb);
					break;
				} else if (isNotPrime[n]) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else {
				if (n % 2 == 0) {
					isPrime = false;
				} else if (n % 3 == 0) {
					isPrime = false;
				} else if (n % 5 == 0) {
					isPrime = false;
				} else if (n % 7 == 0) {
					isPrime = false;
				} else {
					for (int i = 11; i <= upValue; i += 2) {
						if (!isNotPrime[i]) {
							if (n % i == 0) {
								isPrime = false;
								break;
							}
						}
					}
				}

				if (isPrime) {
					sb.append("0\n");
				} else {
					sb.append("1\n");
				}

			}
		}
		scan.close();
	}
}