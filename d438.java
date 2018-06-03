import java.util.Scanner;

public class d438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean[] isNotPrime = new boolean[1000001];
		isNotPrime[1] = true;
		for (int i = 2; i <= Math.sqrt(1000001); ++i) {
			if (!isNotPrime[i])
				for (int j = i * i; j <= 1000000; j += i) {
					isNotPrime[j] = true;
				}
		}

		boolean[] isDigitPrime = new boolean[1000001];
		isDigitPrime[2] = true;
		isDigitPrime[3] = true;
		isDigitPrime[5] = true;
		isDigitPrime[7] = true;
		for (int i = 11; i <= 1000000; i += 2) {
			if (!isNotPrime[i]) {
				if (!isNotPrime[sumOfEachNumber(i)]) {
					isDigitPrime[i] = true;
				}
			}
		}

		while (scan.hasNext()) {
			int N = scan.nextInt();

			for (int i = 0; i < N; ++i) {
				int digitPrime = 0;
				int t1 = scan.nextInt();
				int t2 = scan.nextInt();

				for (int j = t1; j <= t2; ++j) {
					if (isDigitPrime[j]) {
						digitPrime++;
					}
				}
				System.out.println(digitPrime);
			}
		}
		scan.close();
	}

	static int sumOfEachNumber(int num) {
		int result = 0;

		while (num > 0) {
			result += num % 10;
			num /= 10;
		}
		return result;
	}
}