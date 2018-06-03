import java.util.Scanner;

public class b884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				double x = scan.nextDouble();
				double y = scan.nextDouble();

				double r = Math.sqrt((x - 0) + (y - 0));
				double yee = 100 - r * r;
				if (yee > 0 && yee <= 30) {
					System.out.println("sad!");
				} else if (yee > 30 && yee <= 60) {
					System.out.println("hmm~~");
				} else if (yee > 60 && yee < 100) {
					System.out.println("Happyyummy");
				} else {
					System.out.println("evil!!");
				}
			}
		}
	}
}
