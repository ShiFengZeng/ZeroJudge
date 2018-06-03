import java.util.Scanner;

public class a863 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int count = 100;
			int num = squreSum(n);
			while (count > 0) {
				num = squreSum(num);
				if (num == 1)
					break;				
				count--;
			}
			
			if (num == 1) {
				System.out.println(String.format("%d is a happy number", n));
			} else {
				System.out.println(String.format("%d is an unhappy number", n));
			}

		}
		scan.close();
	}

	public static int squreSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += (n % 10) * (n % 10);
			n /= 10;
		}
		return sum;
	}
}