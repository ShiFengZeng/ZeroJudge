import java.util.Scanner;

public class d784 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int T = scan.nextInt();
			for (int i = 0; i < T; ++i) {
				int n = scan.nextInt();
				int[] num = new int[n];

				for (int j = 0; j < n; ++j) {
					num[j] = scan.nextInt();
				}

				System.out.println(GetMax(num));
			}
		}
		scan.close();
	}

	public static int GetMax(int[] array) {
		int sum = Detect(array);
		if (sum < 0)
			return sum;
		int max = array[0];
		for (int i = 0; i < array.length; ++i) {
			sum += array[i];
			sum = Math.max(0, sum);
			max = Math.max(sum, max);
		}
		return max;
	}

	// 代刚琌璽计琌杠肚程璽计玥肚0
	private static int Detect(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; ++i) {
			if (array[i] >= 0)
				return 0;
			max = Math.max(array[i], max);
		}
		return max;
	}
}