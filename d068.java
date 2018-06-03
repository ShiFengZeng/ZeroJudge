import java.util.Scanner;

public class d068 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int w = scan.nextInt();
			System.out.println(w > 50 ? w - 1 : w);
		}
	}
}
