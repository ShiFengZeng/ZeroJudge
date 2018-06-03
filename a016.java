import java.util.Scanner;

public class a016 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] sudoku = new int[9][9];		

		while (scan.hasNext()) {
			
			boolean checkRow = true;
			boolean checkCol = true;
			boolean checkBlock = true;

			for (int i = 0; i < 9; ++i) {
				for (int j = 0; j < 9; ++j) {
					sudoku[i][j] = scan.nextInt();
				}
			}

			for (int i = 0; i < 9; ++i) {
				int sum = 0;
				for (int j = 0; j < 9; ++j) {
					sum += sudoku[i][j];
				}
				if (sum != 45) {
					checkRow = false;
					break;
				}
			}

			for (int i = 0; i < 9; ++i) {
				int sum = 0;
				for (int j = 0; j < 9; ++j) {
					sum += sudoku[j][i];

				}
				if (sum != 45) {
					checkCol = false;
					break;
				}
			}

			for (int i = 0; i < 9; i += 3) {
				for (int j = 0; j < 9; j += 3) {
					int sum = 0;
					for (int k = 0; k < 3; k++) {
						for (int l = 0; l < 3; l++) {
							sum += sudoku[i + k][j + l];
						}
					}
					if (sum != 45) {
						checkBlock = false;
						break;
					}
				}
			}
			if (checkRow && checkCol && checkBlock) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
