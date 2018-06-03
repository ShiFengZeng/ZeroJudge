import java.util.Scanner;

public class b682 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int H1 = scan.nextInt();
			int M1 = scan.nextInt();
			int H2 = scan.nextInt();
			int M2 = scan.nextInt();

			if (M2 < M1) {
				M2 += 60;
				H2--;
			}
			if (H2 < H1) {
				H2 += 24;
			}
			System.out.println((H2 - H1) + " " + (M2 - M1));
		}
	}
}