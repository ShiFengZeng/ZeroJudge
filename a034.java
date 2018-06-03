import java.util.Scanner;

public class a034 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();

			System.out.println(toBinary(a));
		}
	}

	public static String toBinary(int a) {
		String result = "";
		while (a > 0) {
			result = a % 2 + result;
			a = a / 2;
		}
		return result;
	}
}
