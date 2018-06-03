import java.util.Scanner;

public class a149 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			String[] str = new String[n];

			for (int i = 0; i < n; ++i) {
				int a = 1;
				str[i] = scan.next();
				char[] c = str[i].toCharArray();
				for (int j = 0; j < c.length; ++j) {
					a *= c[j] - '0';
				}
				System.out.println(a);
			}
		}
	}
}
