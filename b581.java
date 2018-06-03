import java.util.Scanner;

public class b581 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			String str = scan.nextLine();
			for (int i = 0; i < n; ++i) {
				str = scan.nextLine();
				String s[] = str.split("[ ]+");
				int sum = 0;
				for (int j = 0; j < s.length; ++j) {
					sum += Integer.parseInt(s[j]);
				}
				System.out.println(sum);
			}
		}
		scan.close();
	}
}