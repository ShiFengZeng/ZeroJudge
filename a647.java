import java.util.Scanner;

public class a647 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		double m;
		double p;
		

		while (scan.hasNext()) {
			n = scan.nextInt();
			
			
			for (int i = 0; i < n; ++i) {
				String str = "keep";
				m = scan.nextDouble();
				p = scan.nextDouble();

				double rate = (p - m) / m * 100;

				if (rate >= 10.00 || rate <= -7.00) {
					str = "dispose";
				}

				System.out.println(String.format("%.2f%% %s", rate, str));
			}
		}
		scan.close();
	}
}