import java.util.Scanner;

public class b911 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n;
		StringBuilder sb = new StringBuilder();

		while (scan.hasNext()) {
			n = scan.nextLong();

			long count = 0;
			long i = 1;
			while (i <= n) {
				i *= 2;
				count++;
			}
			sb.append(count + "\n");
		}
		System.out.println(sb);
		scan.close();
	}
}