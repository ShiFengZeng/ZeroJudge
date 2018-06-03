import java.util.Scanner;

public class d786_2 {
//slow
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		int n;
		while (scan.hasNext()) {
			t = scan.nextInt();

			for (int i = 0; i < t; ++i) {
				n = scan.nextInt();
				double[] num = new double[n];
				double sum = 0;
				for (int j = 0; j < n; ++j) {
					num[j] = scan.nextInt();
					sum += num[j];
				}
				double avg = sum / n;

				System.out.printf("%.2f\n", avg);
			}

		}
		scan.close();
	}
}