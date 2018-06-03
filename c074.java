import java.util.Scanner;
import java.util.Stack;

public class c074 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			if (n == 0) {
				break;
			}
			int num[] = new int[n];

			for (int i = 0; i < n; ++i) {
				num[i] = scan.nextInt();
			}
			dfs(0, 6, num);
		}
		scan.close();
	}

	static Stack<Integer> stack = new Stack<Integer>();
	static boolean[] used = new boolean[13];

	public static void dfs(int now, int goal, int[] n) {
		if (stack.size() == goal) {
			for (int i = 0; i < goal; ++i) {
				System.out.print(stack.get(i) + " ");
			}
			System.out.println();
		}

		for (int i = now; i < n.length; ++i) {
			if (!used[i]) {
				used[i] = true;
				stack.push(n[i]);
				dfs(i + 1, goal, n);
				stack.pop();
				used[i] = false;
			}
		}
	}
}