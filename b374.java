import java.util.Scanner;

public class b374 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;

		while (scan.hasNext()) {
			N = scan.nextInt();
			int max = 0;
			int[] num = new int[30001];

			for (int i = 0; i < N; ++i) {
				int n = scan.nextInt();
				num[n]++;
				max = Math.max(max, num[n]);
			}

			for (int i = 1; i <= 30000; ++i) {
				if (num[i] == max) {
					System.out.println(i + " " + num[i]);
				}
			}

		}
		scan.close();
	}
}