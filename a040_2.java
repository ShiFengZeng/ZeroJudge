import java.util.Scanner;

public class a040_2 {

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
					sum += Math.pow(Integer.valueOf(str.charAt(j) - '0'), str.length());
				}
				if (sum == i) {
					System.out.print(sum + " ");
					hasArmstrongNumber = true;
				}
			}

			if (!hasArmstrongNumber) {
				System.out.println("none");
			} else {
				System.out.println();
			}
		}
		scan.close();
	}
}
