import java.util.Scanner;

public class d563 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] num = new int[n];
			for (int i = 0; i < n; ++i) {
				num[i] = scan.nextInt();
			}
			int prefixIndex = 0;
			int suffixIndex = n - 1;

			int diff = 0;
			int equalCount = 0;

			while (prefixIndex < n && suffixIndex >= 0) {
				if (diff > 0) {
					diff -= num[suffixIndex];
					suffixIndex--;
				} else if (diff < 0) {

					diff += num[prefixIndex];
					prefixIndex++;
				} else {
					equalCount++;
					diff = num[prefixIndex] - num[suffixIndex];
					prefixIndex++;
					suffixIndex--;
				}
			}
			System.out.println(equalCount);
		}
		scan.close();
	}
}