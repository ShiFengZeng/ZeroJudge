import java.util.Scanner;

public class a253 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		while (scan.hasNext()) {
			int[] S = new int[101];

			while (true) {
				n = scan.nextInt();
				if (n == -1) {
					break;
				}
				S[n] = scan.nextInt();
			}
			while (true) {
				n = scan.nextInt();
				if (n == -1) {
					break;
				}
				S[n] += scan.nextInt();
			}
			for (int i = 0; i < 101; ++i) {
				if (S[i] > 0)
					System.out.println(i + " " + S[i]);
			}

		}
		scan.close();
	}
}