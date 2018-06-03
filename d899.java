import java.util.Scanner;

public class d899 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L, R;

		while (scan.hasNext()) {
			L = scan.nextInt();
			R = scan.nextInt();
			int count = 0;

			for (int i = L; i <= R; ++i) {
				String si = Integer.toString(i);
				int siLen = si.length();
				for (int j = 0; j < siLen; ++j) {
					if (si.charAt(j) == '2') {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}