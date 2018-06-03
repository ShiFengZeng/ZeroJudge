import java.util.LinkedList;
import java.util.Scanner;

public class a017 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str;
		while (scan.hasNext()) {
			str = scan.nextLine();
			
			Infix ifx = new Infix();
			CalculatePostfixTwo cp = new CalculatePostfixTwo();

			System.out.println(cp.eval(ifx.toPostfix(str)));
		}
		scan.close();
	}
}

// d0116
class CalculatePostfixTwo {
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
		str = str.trim();
		String[] s = str.split("[ ]+");
		for (String stmp : s) {
			if ("+-*//%".indexOf(stmp) != -1) {
				int b = stack.removeLast().intValue();
				int a = stack.removeLast().intValue();
				stack.add(cal(stmp, a, b));
			} else {
				stack.add(Integer.valueOf(stmp));
			}
		}

		return stack.getLast();
	}
}

class Infix {
	private int priority(char c) {
		return c == '+' || c == '-' ? 1 : c == '*' || c == '/' || c == '%' ? 2 : 0;
	}

	public String toPostfix(String infix) {
		LinkedList<Character> stack = new LinkedList<>();
		StringBuilder output = new StringBuilder();

		char inputStack = '(';
		char outPutStack = ')';

		String[] str = infix.split(" ");
		char[] ch = String.join(" ", str).toCharArray();

		for (char c : ch) {
			if (c == inputStack) {
				stack.add(c);
			} else if ("+-*/%".indexOf(c) != -1) {
				while (!stack.isEmpty() && priority(stack.getLast()) >= priority(c)) {
					output.append(stack.removeLast() + " ");
				}
				stack.add(c);
			} else if (c == outPutStack) {
				while (stack.getLast() != inputStack) {
					output.append(stack.removeLast() + " ");
				}
				stack.removeLast();
			} else {
				output.append(c);
			}
		}
		while (!stack.isEmpty()) {
			output.append(" " + stack.removeLast());
		}
		return output.toString();
	}
}