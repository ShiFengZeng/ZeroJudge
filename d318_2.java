import java.util.Scanner;

public class d318_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			if (n < 0) {
				break;
			}
			System.out.println(Integer.toString(n, 3));
		}
		scan.close();
	}

}