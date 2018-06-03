import java.util.Scanner;

public class d307 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean[] isNotPrime = new boolean[32769];
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		for (int a = 2; a * a <= 32768; a++) {
			if (!isNotPrime[a]) {
				for (int b = a * a; b <= 32768; b += a) {
					isNotPrime[b] = true;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int upNum = n / 2;
			int count = 0;
			
			if (n == 0) {
				System.out.print(sb);
				break;
			} else {
				for (int i = 2; i <= upNum; ++i) {
					if (!isNotPrime[i] && !isNotPrime[n - i]) {
						count++;
					}
				}
				sb.append(count+"\n");
			}
		}
		scan.close();
	}
}
