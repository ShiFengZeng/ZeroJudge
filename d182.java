import java.util.Scanner;

public class d182 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			if (n == 2) {
				for (int i = 0; i <= 9; ++i) {
					for (int j = 0; j <= 9; ++j) {
						if ((i + j) * (i + j) == 10 * i + j) {
							System.out.println(i + "" + j);
						}
					}
				}
			}

			if (n == 4) {
				for (int i = 0; i <= 99; ++i) {
					for (int j = 0; j <= 99; ++j) {
						if ((i + j) * (i + j) == 100 * i + j) {
							System.out.println(String.format("%04d",100 * i + j));
						}
					}
				}
			}

			if (n == 6) {
				for (int i = 0; i <= 999; ++i) {
					for (int j = 0; j <= 999; ++j) {
						if ((i + j) * (i + j) == 1000 * i + j) {
							System.out.println(String.format("%06d",1000 * i + j));
						}
					}
				}
			}

			if (n == 8) {
				for (int i = 0; i <= 9999; ++i) {
					for (int j = 0; j <= 9999; ++j) {
						if ((i + j) * (i + j) == 10000 * i + j) {
							System.out.println(String.format("%08d",10000 * i + j));
						}
					}
				}
			}
		}
		scan.close();
	}
}