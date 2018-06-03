import java.util.Scanner;

public class d573 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] p = new int[100000 + 1];
		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				int groupNumber = scan.nextInt();
				int groupTotalMembers = scan.nextInt();

				for (int j = 0; j < groupTotalMembers; ++j) {
					p[scan.nextInt()] = groupNumber;
				}
			}
			int y = scan.nextInt();
			System.out.println(p[y]);
		}
		scan.close();
	}
}