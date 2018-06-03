import java.util.Scanner;

public class d356 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k;

		while (scan.hasNext()) {
			int n = 1;
			double sum = 1;
			k = scan.nextInt();

			while (sum <= k) {		
				n++;
				sum +=(double) 1 / n;				
			}
			System.out.println(n);
		}
		scan.close();
	}
}