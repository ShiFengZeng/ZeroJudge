import java.util.Scanner;

public class d671 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			String str = scan.nextLine();
			for (int i = 0; i < n; ++i) {
				str = scan.nextLine();
				double dl = (double) Math.sqrt(str.length());
				int il = (int) Math.sqrt(str.length());
				if (dl == il) {
					decode(str, il);
				} else {
					System.out.println("INVALID");
				}
			}
		}
		scan.close();
	}

	public static void decode(String str, int len) {
		char[][] c = new char[len][len];
		int i = 0;

		for (int j = 0; j < len; ++j) {
			for (int k = 0; k < len; ++k) {
				c[j][k] = str.charAt(i);
				i++;
			}
		}

		for (int j = 0; j < len; ++j) {
			for (int k = 0; k < len; ++k) {
				System.out.print(c[k][j]);
			}
		}
		System.out.println();
	}
}