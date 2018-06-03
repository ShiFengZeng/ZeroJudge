import java.util.Scanner;

public class a466 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String str;
		while (scan.hasNext()) {
			n = scan.nextInt();

			for (int i = 0; i < n; ++i) {
				int one = 0;

				str = scan.next();

				if (str.length() == 5) {
					System.out.println("3");
				} else {
					if (str.charAt(0) == 'o') {
						one++;
					}
					if (str.charAt(1) == 'n') {
						one++;
					}
					if (str.charAt(2) == 'e') {
						one++;
					}
					
					if (one >= 2) {
						System.out.println("1");
					} else  {
						System.out.println("2");
					}
				}
				
			}
		}
		scan.close();
	}
}