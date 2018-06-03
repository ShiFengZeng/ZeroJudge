import java.util.Arrays;
import java.util.Scanner;

public class c010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int count = 0;
		int[] num = new int[10000];
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			n = scan.nextInt();
			num[count] = n;
			count++;
			Arrays.sort(num, 0, count);

			if (count % 2 == 0) {
				sb.append((num[count / 2] + num[count / 2 - 1]) / 2 + "\n");
			} else {
				sb.append(num[(count - 1) / 2] + "\n");
			}
			
		}
		System.out.print(sb);
		scan.close();
	}
}