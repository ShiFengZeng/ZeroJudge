import java.util.Scanner;

public class b230 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			boolean[] isNotConvenientNumber = new boolean[1849];
			int[] table = new int[66];

			for (int a = 1; a < 60; a++) {
				for (int b = a + 1; b < 60; b++) {
					for (int c = b + 1; c < 60; c++) {
						int temp = a * b + b * c + c * a;
						if (temp < 1849)
							isNotConvenientNumber[temp] = true;
					}
				}
			}
			int n = 1;
			for (int i = 1; i < 1849; ++i) {
				if (!isNotConvenientNumber[i]) {
					table[n++] = i;
				}
			}

			int num = scan.nextInt();
			System.out.println(table[num]);
		}
		scan.close();
	}
}
