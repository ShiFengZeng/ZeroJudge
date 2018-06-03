import java.util.Scanner;

public class c134 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			int N = scan.nextInt();

			for (int T = 0; T < N; ++T) {
				int number = scan.nextInt();

				int sum = 0;
				int[] num = new int[1001];
				int n = 2;
				while (sum + n <= number) {
					sum += n;
					num[n] = n;
					n++;
				}

				int diff = number - sum;
				int index = n - 1;
				while (diff > 0) {
					num[index]++;
					index--;
					diff--;
					if (index < 2) {
						index = n - 1;
					}
				}

				for (int i = 2; i < n; ++i) {
					sb.append(num[i] + " ");
				}
				sb.append("\n");
			}
			System.out.print(sb);
		}
		scan.close();
	}
}
