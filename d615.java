import java.util.Scanner;

public class d615 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			String str = scan.nextLine();

			for (int i = 0; i < n; ++i) {
				str = scan.nextLine();
				System.out.println(cal(str));
			}
		}
		scan.close();
	}

	public static String cal(String str) {
		String[] s = str.split(" ");

		for (int i = 0; i < s.length - 2; i+=2) {
			s[i + 2] = cal(s[i], s[i + 1], s[i + 2]);
		}

		return s[s.length-1];
	}

	public static String cal(String s1, String op, String s2) {
		long result = 0;
		long a = Long.valueOf(s1);
		long b = Long.valueOf(s2);

		switch (op) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		}

		return String.valueOf(result);
	}
}