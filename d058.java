import java.util.Scanner;

public class d058 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();

			if (a < 0)
				System.out.println("-1");
			else if (a == 0)
				System.out.println("0");
			else
				System.out.println("1");
		}
	}
}
