import java.util.Scanner;

public class d658 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = 1;

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int ans = 0;

			if (n < 0) {
				break;
			}
			 while (Math.pow(2, ans) < n) {
			 ans++;
			 }
//			ans = (int) Math.ceil(Math.log(n) / Math.log(2));
			System.out.println(String.format("Case %d: %d", i, ans));
			i++;
		}
	}
}
