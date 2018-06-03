import java.util.Scanner;

public class c002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;

		while (scan.hasNext()) {
			number = scan.nextInt();
			if(number==0)
				break;
			System.out.println(String.format("f91(%d) = %d", number, f91(number)));
		}
		scan.close();
	}

	public static int f91(int n) {
		if (n <= 100) {
			return f91(f91(n + 11));
		} else {
			return n - 10;
		}
	}
}