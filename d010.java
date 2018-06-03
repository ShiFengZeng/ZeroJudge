import java.util.Scanner;

public class d010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;

		while (scan.hasNext()) {
			int S = 0;
			N = scan.nextInt();

			for (int i = 1; i < N; ++i) {
				if (N % i == 0) {
					S += i;
				}
			}

			if (S > N) {
				System.out.println("盈數");
			} else if (S < N) {
				System.out.println("虧數");
			} else {
				System.out.println("完全數");
			}
		}
		scan.close();
	}
}