import java.util.Scanner;

public class c015 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			int N = scan.nextInt();

			for (int i = 0; i < N; ++i) {
				int time = 0;
				long P = scan.nextLong();

				long res = reserve(P);
				do {
					time++;
					P += res;
					res = reserve(P);
				} while (P != res);
				sb.append(time + " " + P + "\n");
			}
			System.out.print(sb);
		}
		scan.close();
	}

	static long reserve(long num) {
		long result = 0;

		while (num > 0) {
			result *= 10;
			result += num % 10;
			num /= 10;
		}

		return result;
	}
}