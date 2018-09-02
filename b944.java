import java.util.Scanner;

public class b944 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] UrinalNumber = new int[n];
			int[] UrinalTime = new int[n];

			while (scan.hasNext()) {
				int number = scan.nextInt();
				int time = scan.nextInt();

				for (int i = 0; i < n; ++i) {
					if (UrinalTime[i] == 0) {
						UrinalNumber[i] = number;
						UrinalTime[i] = time;
						break;
					}
				}
				for (int i = 0; i < n; ++i) {
					System.out.println(UrinalNumber[i] + " " + UrinalTime[i]);
				}
			}
		}
		scan.close();
	}
}