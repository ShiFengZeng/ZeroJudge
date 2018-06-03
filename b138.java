import java.util.Scanner;

public class b138 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int b;

		while (scan.hasNext()) {
			int count = 0;

			for (int i = 0; i < 10; i++) {
				a[i] = scan.nextInt();
			}
			b = scan.nextInt();
			for (int i = 0; i < 10; i++) {
				if (b + 30 >= a[i])
					count++;
			}

			System.out.println(count);
		}
		scan.close();
	}
}