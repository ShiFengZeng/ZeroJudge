import java.util.Scanner;

public class a671 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int n = scan.nextInt();
			double p = scan.nextDouble();
			
			System.out.println(Math.round(Math.pow(p, (1.0/n))));
		}
		scan.close();
	}
}
