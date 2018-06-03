import java.util.Scanner;

public class a040 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			boolean hasArmstrongNumber = false;

			for (int i = a; i <= b; ++i) {
				String str = String.valueOf(i);
				int sum = 0;
				for (int j = 0; j < str.length(); ++j) {
					sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(j))), str.length());
				}
				if (sum == i) {
					System.out.print(sum + " ");
					hasArmstrongNumber = true;
				}
			}
			System.out.println();
			if (!hasArmstrongNumber) {
				System.out.println("none");
			}
		}
	}
}
