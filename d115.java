import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class d115 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			if (n == 0) {
				break;
			}
			int[] num = new int[n];

			for (int i = 0; i < n; ++i) {
				num[i] = scan.nextInt();
			}
			int m = scan.nextInt();

			Arrays.sort(num);
			combine(num, 0, m);
		}
		scan.close();
	}

	static Stack<Integer> stack = new Stack<Integer>();
	static boolean[] isUsed = new boolean[101];

	static void combine(int[] n, int start, int m) {
		if (stack.size() == m) {
			for (int i = 0; i < m; ++i) {
				System.out.print(stack.get(i) + " ");
			}
			System.out.println();
		}

		for (int i = start; i < n.length; ++i) {
			if (!isUsed[i]) {
				stack.push(n[i]);
				isUsed[i] = true;
				combine(n, i + 1, m);
				stack.pop();
				isUsed[i] = false;
			}
		}
	}
}