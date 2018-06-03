import java.util.Scanner;

public class d190_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		int[] age = new int[101];
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			n = scan.nextInt();
			if (n == 0) {
				System.out.println(sb);
				break;
			}
			for (int i = 0; i < n; ++i) {
				age[scan.nextInt()]++;
			}
			for (int i = 1; i <= 100; ++i) {
				while (age[i] > 0) {
					sb.append(i + " ");
					age[i]--;
				}
			}
			sb.append("\n");
		}
		scan.close();
	}
}