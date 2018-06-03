import java.util.Scanner;

public class c382 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;
		String str = "";
		while (scan.hasNext()) {
			a = scan.nextInt();
			str = scan.next();
			b = scan.nextInt();

			switch (str) {
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				System.out.println(a / b);
			}
		}
		scan.close();
	}
}
