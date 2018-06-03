import java.util.Scanner;

public class c085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int _case = 1;

		while (scan.hasNext()) {
			int Z = scan.nextInt();
			int I = scan.nextInt();
			int M = scan.nextInt();
			int L = scan.nextInt();
			int cycleLength = 0;
			boolean[] isCycle = new boolean[10000];

			if (Z == 0 && I == 0 && M == 0 && L == 0) {
				break;
			} else {
				L = (Z * L + I) % M;
				while (!isCycle[L]) {
					cycleLength++;
					isCycle[L] = true;
					L = (Z * L + I) % M;
				}
				System.out.println(String.format("Case %d: %d", _case, cycleLength));
				_case++;
			}
		}
		scan.close();
	}
}