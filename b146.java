import java.util.Scanner;

public class b146 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] s = new int[7];
		int[] m = new int[7];

		while (scan.hasNext()) {
			for (int i = 0; i < 7; ++i) {
				s[i] = scan.nextInt();
				m[i] = scan.nextInt();
			}

			for (int i = 0; i < 7; ++i) {
				if (s[i] + m[i] > 8) {
					System.out.println(i + 1);
					break;
				}
			}
		}
		scan.close();
	}
}