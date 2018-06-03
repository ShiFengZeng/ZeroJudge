import java.util.Scanner;

public class a015 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {

			int row = scan.nextInt();
			int column = scan.nextInt();

			int[][] array = new int[row][column];

			for (int i = 0; i < row; ++i) {
				for (int j = 0; j < column; ++j) {
					array[i][j] = scan.nextInt();
				}
			}

			for (int i = 0; i < column; ++i) {
				for (int j = 0; j < row ; ++j) {
					System.out.print(array[j][i]+" ");
				}
				System.out.println();
			}
		}
	}
}
