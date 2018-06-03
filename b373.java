import java.util.Scanner;

public class b373 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] number = new int[n];

			for (int i = 0; i < n; ++i) {
				number[i] = scan.nextInt();
			}

			int count = 0;

			for (int i = 0; i < number.length; ++i) {
				for (int j = 0; j < number.length - 1; ++j) {
					if (number[j] > number[j + 1]) {
						int temp = number[j];
						number[j] = number[j + 1];
						number[j + 1] = temp;
						count++;
					}
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}