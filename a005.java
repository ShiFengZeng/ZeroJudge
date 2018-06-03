import java.util.Scanner;

public class a005 {
	public static void main(String[] args) {
		int[][] a = new int[20][5];
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int j = 0; j < n; j++) {
				for (int i = 0; i < 4; i++) {
					a[j][i] = scan.nextInt();
				}
			}

			for (int j = 0; j < n; j++) {
				if (a[j][3] - a[j][2] == a[j][2] - a[j][1]) {
					a[j][4] = a[j][3] + (a[j][3] - a[j][2]);
				} else if (a[j][3] / a[j][2] == a[j][2] / a[j][1]) {
					a[j][4] = a[j][3] * (a[j][3] / a[j][2]);
				}
			}
			for (int j = 0; j < n; j++) {
				for (int i = 0; i < 5; i++) {
					System.out.print(a[j][i] + " ");					
				}
				System.out.println();
			}
		}
	}
}
