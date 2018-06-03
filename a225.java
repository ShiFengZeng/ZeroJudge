import java.util.Scanner;

public class a225 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] inputArr = new int[n];

			for (int i = 0; i < n; ++i) {
				inputArr[i] = scan.nextInt();
			}
			for (int i = 0; i < n - 1; ++i) {
				for (int j = i + 1; j < n; ++j) {
					if (inputArr[i] % 10 > inputArr[j] % 10) {
						int temp = inputArr[i];
						inputArr[i] = inputArr[j];
						inputArr[j] = temp;
					}
				}
			}
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (inputArr[i] % 10 == inputArr[j] % 10) {
						if (inputArr[i] > inputArr[j]) {
							int temp = inputArr[i];
							inputArr[i] = inputArr[j];
							inputArr[j] = temp;
						}
					}
				}
			}
			for (int a : inputArr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
