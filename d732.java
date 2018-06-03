import java.util.Scanner;

public class d732 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, k;

		while (scan.hasNext()) {
			n = scan.nextInt();
			k = scan.nextInt();
			int[] numArr = new int[n];

			for (int i = 0; i < n; ++i) {
				numArr[i] = scan.nextInt();
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < k; ++i) {
				int X = scan.nextInt();
				sb.append(binarySearch(numArr, X)+"\n");
			}
			System.out.print(sb);
		}
		scan.close();
	}

	static int binarySearch(int[] numArr, int X) {
		int low = 0;
		int high = numArr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (X < numArr[mid]) {
				high = mid - 1;
			} else if (X > numArr[mid]) {
				low = mid + 1;
			} else {
				return mid + 1;
			}
		}
		return 0;
	}
}