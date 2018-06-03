import java.util.Scanner;

public class a132 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int I;

		while (scan.hasNext()) {
			I = scan.nextInt();
			if (I != 0)
				System.out.println(String.format("The parity of %s is %s (mod 2).", Integer.toBinaryString(I),
						Integer.bitCount(I)));
			else {
				break;
			}
		}
		scan.close();
	}
}