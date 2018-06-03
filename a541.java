import java.util.HashSet;
import java.util.Scanner;

public class a541 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String str;
		HashSet<String> word = new HashSet<>();

		while (scan.hasNext()) {
			n = scan.nextInt();
			for (int i = 0; i < n; ++i) {
				str = scan.next();
				word.add(str);
			}
			n = scan.nextInt();
			for (int i = 0; i < n; ++i) {
				str = scan.next();

				if (!word.add(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
		scan.close();
	}
}