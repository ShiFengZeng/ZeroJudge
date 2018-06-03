import java.util.Scanner;

public class d117 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.nextLine();
			int sum = getSumOfLetter(str);

			if (isPrime(sum) == true) {
				System.out.println("It is a prime word.");
			} else {
				System.out.println("It is not a prime word.");
			}
		}
	}

	public static int getSumOfLetter(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				sum += str.charAt(i) - 'A' + 27;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				sum += str.charAt(i) - 'a' + 1;
			}
		}
		return sum;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i += (i == 2 ? 1 : 2)) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
