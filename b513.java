import java.util.Scanner;

public class b513 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		boolean[] isNotPrime = new boolean[65535 + 1];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int a = 2; a * a <= 65535; a++) {
			if (!isNotPrime[a]) {
				for (int b = a * a; b <= 65535; b += a) {
					isNotPrime[b] = true;
				}
			}
		}
		
		while (scan.hasNext()) {
			n = scan.nextInt();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < n; ++i) {
				if (isNotPrime[scan.nextInt()]) {
					sb.append("N\n");
				} else {
					sb.append("Y\n");
				}
			}
			System.out.print(sb);
		}
		scan.close();
	}
}