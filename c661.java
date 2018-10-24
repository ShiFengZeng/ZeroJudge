import java.util.Scanner;

public class c661 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (scan.hasNext()) {
			int T = scan.nextInt();
			for (int j = 0; j < T; ++j) {
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				long count = 0;
				int sum1 = 0;

				

				sb.append(count + "\n");
			}

		}
		System.out.print(sb);
		scan.close();
	}

	public static int getZeroCount(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n / 5;
			n /= 5;
		}

		return sum;
	}
}
