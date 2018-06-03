import java.util.Scanner;

public class a882 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			final char needTwoBucket = 'X';
			final char needOneBucket = 'H';

			for (int i = 0; i < n; ++i) {
				int bucket = 0;
				String duck = scan.next();

				for (int j = 0; j < duck.length(); ++j) {
					if (duck.charAt(j) == needTwoBucket) {
						bucket += 2;
					}else if(duck.charAt(j) ==needOneBucket) {
						bucket++;
					}
				}
				System.out.println(bucket);
			}
		}
		scan.close();
	}
}