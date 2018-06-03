import java.util.Scanner;

public class a799 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(n > 0 ? n : -n);
		}
	}
}
