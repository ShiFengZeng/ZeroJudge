import java.util.Scanner;

public class a519 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long[] generation = new long[81];
		while (scan.hasNext()) {
			int g = scan.nextInt();
			if (g == 0) {
				break;
			} else {
				generation[0] = 1;
				generation[1] = 1;
				for (int i = 2; i <= g; ++i) {
					generation[i] = generation[i - 1] + generation[i - 2];
				}
				System.out.println(generation[g]);
			}
		}
		scan.close();
	}
}