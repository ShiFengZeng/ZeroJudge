import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nLine;
		while ((nLine = br.readLine()) != null) {
			int n = Integer.valueOf(nLine);
			for (int i = 0; i < n; ++i) {
				String input = br.readLine();
				Stack<Character> stack = new Stack<Character>();
				boolean isCorrect = true;
				int inputLen = input.length();
				for (int j = 0; j < inputLen; ++j) {
					char temp = input.charAt(j);
					if (temp == '(' || temp == '[') {
						stack.push(temp);
					} else if (temp == ')') {
						if (stack.isEmpty() || stack.peek() != '(') {
							isCorrect = false;
							break;
						}
						stack.pop();
					} else if (temp == ']') {
						if (stack.isEmpty() || stack.peek() != '[') {
							isCorrect = false;
							break;
						}
						stack.pop();
					}
				}
				if(!stack.empty())
					isCorrect=false;
				System.out.println(isCorrect ? "Yes" : "No");
			}
		}
	}
}