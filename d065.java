import java.util.Scanner;

public class d065 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			int[] arr = new int[3];
			int max = arr[0];

			for (int i = 0; i < arr.length; ++i) {
				arr[i] = scan.nextInt();
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println(max);
		}
	}
}
