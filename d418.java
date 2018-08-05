import java.util.Scanner;

public class d418 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; ++i) {
				int num = scan.nextInt();
				int[] a = new int[10];
				if (num == 1) {
					sb.append(1 + "\n");
				} else {
					for (int j = 9; j >= 2; --j) {
						while (num % j == 0) {
							a[j]++;
							num /= j;
						}
						if (num == 1) {
							break;
						}
					}
					if (num != 1) {
						sb.append(-1 + "\n");
					} else {
						for (int j = 2; j <= 9; ++j) {
							while (a[j] > 0) {
								sb.append(j);
								a[j]--;
							}
						}
					}
					sb.append("\n");
				}
			}
			System.out.println(sb);
		}
		scan.close();
	}
}