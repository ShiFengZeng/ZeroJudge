import java.util.Scanner;

public class d127 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long L;

		while (scan.hasNext()) {
			L = scan.nextLong();

			L = L / 2;

			long w = L / 2;
			long l = L - w;

			System.out.println(w * l);

		}
		scan.close();
	}
}