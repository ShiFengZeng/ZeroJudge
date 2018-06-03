import java.util.Scanner;
import java.util.Stack;

public class a524 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			dfs(n);
		}
		scan.close();
	}

	static Stack<Integer> stack = new Stack<Integer>();
	static boolean[] used = new boolean[9];

	public static void dfs(int n) {

		if (stack.size() == n) {
			for (int i = 0; i <n;++i) {
				System.out.print(stack.get(i));
			}
			System.out.println();
		}

		for (int i = n; i >= 1; --i) {
			if (!used[i]) {
				used[i] = true;
				stack.push(i);
				dfs(n);
				stack.pop();
				used[i] = false;
			}
		}
	}
}