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
				System.out.println("�ռ�");
			} else if (S < N) {
				System.out.println("����");
			} else {
				System.out.println("������");
			}
		}
		scan.close();
	}
}