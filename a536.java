import java.util.Scanner;

public class a536 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;

		while (scan.hasNext()) {
			N = scan.nextInt();

			for (int i = 0; i < N; ++i) {
				int e = scan.nextInt();
				int f = scan.nextInt();
				int c = scan.nextInt();
				int totalEmptyBottle = e + f;
				int sodaSum = 0;

				while (totalEmptyBottle / c > 0) {
					sodaSum += totalEmptyBottle / c;
					totalEmptyBottle = totalEmptyBottle / c + totalEmptyBottle % c;
				}
				
				System.out.println(sodaSum);
			}
		}
		scan.close();
	}
}