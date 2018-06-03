import java.util.Scanner;

public class c036 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double H, D, F, U;

		while (scan.hasNext()) {
			H = scan.nextDouble();
			U = scan.nextDouble();
			D = scan.nextDouble();
			F = scan.nextDouble();

			if (H == 0)
				break;

			double height = 0;
			int day = 0;
			double fatigue = U * (F / 100);

			do {
				day++;
				height += U;
				if (height > H) {
					break;
				}
				height -= D;
				U = U - fatigue;
				if (U <= 0)
					U = 0;
			} while (height >= 0);

			String successOrFailure = "";

			if (height > H) {
				successOrFailure = "success";
			} else {
				successOrFailure = "failure";
			}
			System.out.println(String.format("%s on day %d", successOrFailure, day));
		}
		scan.close();
	}
}