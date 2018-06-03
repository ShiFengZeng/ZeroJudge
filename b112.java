import java.util.Scanner;

public class b112 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; ++i) {
				a[i] = scan.nextInt();
			}
			System.out.println(mulGcd(a));
		}
		scan.close();
	}

	public static int mulGcd(int[] input) {

		for (int i = 0; i < input.length - 1; ++i) {
			input[i + 1] = gcd(input[i], input[i + 1]);
		}

		return input[input.length - 1];
	}

	public static int gcd(int a, int b) {

		while (b > 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}