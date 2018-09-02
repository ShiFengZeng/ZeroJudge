import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b838 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		Stack<Character> stack = new Stack<Character>();
		while ((line = br.readLine()) != null) {
			int t = Integer.valueOf(line);

			for (int i = 0; i < t; ++i) {
				String inp = br.readLine();
				int match = 0;
				stack.clear();
				boolean isError = false;
				for (int j = 0; j < inp.length(); ++j) {
					char temp = inp.charAt(j);

					if (temp == '(') {
						stack.push(temp);
					} else if (temp == ')') {
						if (stack.empty() || stack.peek() != '(') {
							isError = true;
							break;
						} else {
							match++;
							stack.pop();
						}
					}
				}

				if (!stack.empty()) {
					isError = true;
				}
				if (isError) {
					System.out.println(0);
				} else {
					System.out.println(match);
				}
			}
		}		
	}
}