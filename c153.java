import java.util.Scanner;

public class c153 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int num = 1;
			int[][] arr = new int[n][n];
			int i = 0;
			int j = n / 2;

			arr[i][j] = num;
			while (num < n * n) {
				i--;
				j++;
				num++;

				if (i < 0 && j >= n) {
					i += 2;
					j = n - 1;
					arr[i][j] = num;
					continue;
				}
				if (i < 0) {
					i = n - 1;
				}
				if (j >= n) {
					j = 0;
				}

				if (arr[i][j] != 0) {
					i += 2;
					j--;
					if (i >= n)
						i = 0;
					if (j < 0)
						j = n - 1;
					arr[i][j] = num;

				} else {
					arr[i][j] = num;
				}
			}

			for (int k = 0; k < n; k++) {
				for (int l = 0; l < n; ++l) {
					System.out.print(arr[k][l] + " ");
				}
				System.out.println();
			}
		}
	}
}
