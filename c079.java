import java.util.Scanner;

public class c079 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int k;

		while (scan.hasNext()) {
			int count = 0;
			int butt = 0;
			n = scan.nextInt();
			k = scan.nextInt();

			while (n > 0) {
				count += n;
				butt += n;
				n = butt / k;
				butt %= k;
			}

			System.out.println(count);
		}
		scan.close();
	}
}