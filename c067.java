import java.util.Scanner;

public class c067 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int set = 1;
		while (scan.hasNext()) {
			n = scan.nextInt();

			if (n == 0)
				break;
			else {
				int[] num = new int[n];
				int sum = 0;
				int h = 0;

				for (int i = 0; i < n; ++i) {
					num[i] = scan.nextInt();
					sum += num[i];
				}
				h = sum / n;
				int move = 0;
				for (int i = 0; i < n; ++i) {
					move += Math.abs(h - num[i]);
				}
				System.out.println(String.format("Set #%d\r\n" + "The minimum number of moves is %d.", set, move / 2));
				set++;
			}
		}
		scan.close();
	}
}