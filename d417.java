import java.util.Scanner;

public class d417 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int num = scan.nextInt();
			int a = 0;
			int upLen = 2 * num;
			StringBuilder sb = new StringBuilder();
			int count = 0;

			for (int i = num + 1; i <= upLen; ++i) {
				if ((i * num) % (i - num) == 0) {
					count++;
					a = (i * num) / (i - num);
					sb.append(String.format("1/%d = 1/%d + 1/%d\n", num, a, i));
				}
			}
			System.out.print(count + "\n" + sb);
		}
		scan.close();
	}
}