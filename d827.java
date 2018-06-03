import java.util.Scanner;

public class d827 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int a = scan.nextInt();
			int dozen = 0;
			int remaining = 0;

			dozen = a / 12;
			remaining = a % 12;
			int money = dozen * 50 + remaining * 5;
			System.out.println(money);
		}
	}
}
