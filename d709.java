import java.util.Scanner;

public class d709 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		boolean[] isNotPrime = new boolean[65535 + 1];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int a = 2; a * a <= 65535; ++a) {
			if (!isNotPrime[a]) {
				for (int b = a * a; b <= 65535; b += a) {
					isNotPrime[b] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			n = scan.nextInt();

			if (n == 0) {
				System.out.println(sb);
				break;
			} else if (isNotPrime[n]) {
				sb.append("1\n");
			} else {
				sb.append("0\n");
			}
		}
		scan.close();
	}
}