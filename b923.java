import java.util.Scanner;
import java.util.Stack;

public class b923 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			Stack<Integer> stack = new Stack<Integer>();
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				int operating = scan.nextInt();

				if (operating == 1) {
					delete(stack);
				} else if (operating == 2) {
					printTop(stack);
				} else if (operating == 3) {
					int num = scan.nextInt();
					add(stack, num);
				}
			}
		}
		scan.close();
	}

	public static Stack<Integer> delete(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			stack.pop();
		}

		return stack;
	}

	public static void printTop(Stack<Integer> stack) {
		if (!stack.isEmpty()) {
			System.out.println(stack.peek());
		}
	}

	public static Stack<Integer> add(Stack<Integer> stack, int n) {
		stack.push(n);

		return stack;
	}
}
