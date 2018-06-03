import java.util.Scanner;

public class d387 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;

		boolean[] notPrime = new boolean[1000000];
		notPrime[1] = true;
		notPrime[0] = true;
		for (int i = 2; i * i < notPrime.length; i++)
			if (!notPrime[i])
				for (int j = i * 2; j < notPrime.length; j += i)
					notPrime[j] = true;

		while (scan.hasNext()) {
			N = scan.nextInt();
			if (notPrime[N]) {
				System.out.println(String.format("%d is not prime.", N));
			} else {
				if (!notPrime[reverse(N)] && reverse(N) != N) {
					System.out.println(String.format("%d is emirp.", N));
				} else {
					System.out.println(String.format("%d is prime.", N));
				}
			}

		}
		scan.close();
	}

	public static int reverse(int n) {
		int result = 0;
		while (n > 0) {
			result *= 10;
			result += n % 10;
			n /= 10;
		}

		return result;
	}
}