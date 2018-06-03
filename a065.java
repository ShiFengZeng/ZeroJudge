import java.util.Scanner;

public class a065 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = new String();

		while (scan.hasNext()) {

			str = scan.nextLine();
			char[] c = str.toCharArray();
			int a = 0;

			for (int i = 1; i < c.length; ++i) {
				a = Math.abs(c[i] - c[i - 1]);
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
