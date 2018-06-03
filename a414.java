import java.util.Scanner;

public class a414 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int count = 0;
			
			if (n == 0) {
				System.out.print(sb);
				break;
			}
			// String b = Integer.toBinaryString(n);

			// for (int i = b.length() - 1; i >= 0; --i) {
			// if (b.charAt(i) - '0' == 1) {
			// count++;
			// } else {
			// break;
			// }
			// }
			while (n > 0) {
				if (n % 2 == 1) {
					count++;
				} else {
					break;
				}
				n /= 2;
			}
			sb.append(count + "\n");
			// System.out.println(count);
		}
		scan.close();
	}
}
