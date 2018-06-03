import java.util.Scanner;

public class d096 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			long nLineNumber = 1;
			long lastNumberSum = 0;
			long temp = (n + 1) / 2;
			nLineNumber = temp * 2 * temp - 1;
			lastNumberSum = 3 * nLineNumber - 6;

			System.out.println(lastNumberSum);

		}
		scan.close();
	}
}