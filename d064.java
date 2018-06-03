import java.util.Scanner;

public class d064 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();

			System.out.println(a % 2 == 0 ? "Even" : "Odd");
		}
	}
}
