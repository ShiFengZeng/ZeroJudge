import java.util.Scanner;

public class d120 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int originalN = n;
			boolean isRepeat = false;
			int count = 0;

			if (n == 0) {
				break;
			}
			while (n % 2 == 0) {
				if (!isRepeat)
					count++;
				n /= 2;
				isRepeat = true;
			}
			isRepeat = false;
			while (n % 3 == 0) {
				if (!isRepeat)
					count++;
				n /= 3;
				isRepeat = true;
			}
			isRepeat = false;
			while (n % 5 == 0) {
				if (!isRepeat)
					count++;
				n /= 5;
				isRepeat = true;
			}
			isRepeat = false;
			while (n % 7 == 0) {
				if (!isRepeat)
					count++;
				n /= 7;
				isRepeat = true;
			}

			if (n != 1) {
				for (int i = 11; i <=1000000; i += 2) {
					isRepeat = false;
					while (n % i == 0) {
						if (!isRepeat)
							count++;
						n /= i;
						isRepeat = true;
					}
					if (n == 1) {
						break;
					}
				}
			}
			System.out.println(String.format("%d : %d", originalN, count));
		}
		scan.close();
	}
}