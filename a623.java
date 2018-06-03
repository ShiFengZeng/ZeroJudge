import java.util.Scanner;

public class a623 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int m;
		while (scan.hasNext()) {
			m = scan.nextInt();
			n = scan.nextInt();
			System.out.println(factorial(m) / (factorial(n) * factorial(m - n)));
		}
		scan.close();
	}

	public static long factorial(int x) {
		int ans = 1;

		for (int i = x; i > 1; --i) {
			ans *= i;
		}
		return ans;
	}

}