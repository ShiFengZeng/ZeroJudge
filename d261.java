import java.util.Scanner;

public class d261 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			long[] MaleBee = new long[n + 1];
			long[] FemaleBee = new long[n + 1];
			long[] TotalBee = new long[n + 1];

			if (n == -1) {
				break;
			}

			MaleBee[0] = 0;
			FemaleBee[0] = 1;
			TotalBee[0] = 1;

			for (int i = 1; i <= n; ++i) {
				MaleBee[i] += MaleBee[i - 1] + FemaleBee[i - 1];
				FemaleBee[i] += MaleBee[i - 1] + 1;
				TotalBee[i] += MaleBee[i] + FemaleBee[i];
			}
			System.out.println(MaleBee[n] + " " + TotalBee[n]);
		}
	}
}