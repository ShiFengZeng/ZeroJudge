import java.util.Scanner;

public class d635 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int Decimal = scan.nextInt();
			int Digits = 0;
			String Octave = "";

			if (Decimal < 0) {
				System.out.println("-1");
			} else if (Decimal == 0) {
				System.out.println("0");
			} else {
				while (Decimal > 0) {
					Digits = Decimal % 8;
					Octave = String.valueOf(Digits) + Octave;
					Decimal /= 8;
				}
				System.out.println(Octave);
			}
		}
	}
}
