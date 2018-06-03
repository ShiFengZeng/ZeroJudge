import java.util.LinkedList;
import java.util.Scanner;

public class d016 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			CalculatePostfix cp = new CalculatePostfix();
			System.out.println(cp.eval(str));
		}
		scan.close();
	}
}

class CalculatePostfix {
	private int cal(String op, int a, int b) {
		switch (op) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		case "%":
			return a % b;
		default:
			throw new ArithmeticException(op + " is not defined.");
		}
	}

	public int eval(String str) {
		LinkedList<Integer> stack = new LinkedList<>();
		String[] s = str.split(" ");
		for (String stmp : s) {
			if ("+-*/%".indexOf(stmp) != -1) {
				int b = stack.removeLast();
				int a = stack.removeLast();
				stack.add(cal(stmp, a, b));
			} else {
				stack.add(Integer.valueOf(stmp));
			}
		}

		return stack.getLast();
	}
}