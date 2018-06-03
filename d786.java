import java.util.Scanner;

public class d786 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		//fast
		while (scan.hasNext()) {
			n = scan.nextInt();
			
			String str = scan.nextLine();
			for (int i = 0; i < n; ++i) {
				
				str = scan.nextLine();
				String[] s = str.split(" ");

				double sum = 0;

				for (int j = 1; j < s.length; ++j) {
					sum += Double.parseDouble(s[j]);
				}
				
				 double avg = sum / Double.parseDouble(s[0]);
				 System.out.printf("%.2f\n",avg);
			}
			
		}
		scan.close();
	}
}