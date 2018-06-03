import java.util.Scanner;

public class b130 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			boolean[] num = new boolean[1000];
			n = scan.nextInt();
			int M = 0;
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < n; ++i) {
				num[scan.nextInt()] = true;
			}
			for (int i = 1; i < 1000; ++i) {
				if (num[i]) {
					M++;
					sb.append(i + " ");
				}
			}
			System.out.println(M + "\n" + sb);
		}
		scan.close();
	}
}