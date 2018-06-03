import java.util.Scanner;

public class d984 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long A = scan.nextInt();
			long B = scan.nextInt();
			long C = scan.nextInt();

			if (A > B && A > C) {
				if (A > B + C) {
					System.out.println("A");
				} else if (B > C) {
					System.out.println("B");
				} else {
					System.out.println("C");
				}
			} else if (B > A && B > C) {
				if (B > A + C) {
					System.out.println("B");
				} else if (A > C) {
					System.out.println("A");
				} else {
					System.out.println("C");
				}
			} else if (C > A && C > A) {
				if (C > A + B) {
					System.out.println("C");
				} else if (A > B) {
					System.out.println("A");
				} else {
					System.out.println("B");
				}
			}
		}
	}
}
