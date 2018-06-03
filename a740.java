import java.util.Scanner;

public class a740 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			int sum = 0;
			n = scan.nextInt();
			while (n % 2 == 0) {
				sum += 2;
				n /= 2;
			}
			while (n % 3 == 0) {
				sum += 3;
				n /= 3;
			}
			while (n % 5 == 0) {
				sum += 5;
				n /= 5;
			}
			while (n % 7 == 0) {
				sum += 7;
				n /= 7;
			}

			for (int i = 11; i <=n; i += 2) {
				if (n % i == 0) {
					sum += i;
					n /= i;
				}				
			}
							
			
			System.out.println(sum);

		}
		scan.close();
	}
}