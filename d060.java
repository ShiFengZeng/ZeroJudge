import java.util.Scanner;

public class d060 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int m = scan.nextInt();
			System.out.println((85 - m) % 60);
		}
	}
}
