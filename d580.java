import java.util.Scanner;

public class d580 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long[] time = new long[10001];
		time[0] = 1;
		time[1] = 1;
		for (int i = 2; i <= 10000; ++i) {
			time[i] = (time[i - 1] + time[i - 2]) % 2012;
		}
		while (scan.hasNext()) {
			int i = scan.nextInt();
			System.out.println(time[i]);
		}
		scan.close();
	}
}
