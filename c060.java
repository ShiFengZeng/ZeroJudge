import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c060 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			String[] numberStr = line.split("[ ]+");
			int[] coefficient = new int[9];
			for (int i = 8; i >= 0; --i) {
				coefficient[i] = Integer.valueOf(numberStr[8 - i]);
			}
			if (coefficient[0] == 0 && coefficient[1] == 0 && coefficient[2] == 0 && coefficient[3] == 0
					&& coefficient[4] == 0 && coefficient[5] == 0 && coefficient[6] == 0 && coefficient[7] == 0) {
				System.out.println(0);
				continue;
			}
			boolean hasFirst = false;
			boolean isPrint = false;
			int firstNumber = 0;
			for (int i = 8; i >= 0; --i) {
				if (!hasFirst) {
					if (coefficient[i] != 0) {
						hasFirst = true;
						firstNumber = coefficient[i];
					}
				} else {
					if (coefficient[i] > 0)
						System.out.print(" + ");
					else if (coefficient[i] < 0)
						System.out.print(" - ");
				}
				if (coefficient[i] == 0)
					continue;

				if (hasFirst && !isPrint) {
					if (i == 1) {
						if (firstNumber == 1)
							System.out.print("x");
						else if (firstNumber == -1)
							System.out.print("-x");
						else
							System.out.print(firstNumber + "x");
					} else if (i == 0) {
						System.out.print(firstNumber);
					} else {
						if (firstNumber == 1)
							System.out.print("x^" + i);
						else if (firstNumber == -1)
							System.out.print("-x^" + i);
						else
							System.out.print(firstNumber + "x^" + i);
					}
					isPrint = true;
					continue;
				}

				coefficient[i] = Math.abs(coefficient[i]);
				if (i == 1) {
					if (coefficient[i] == 1)
						System.out.print("x");
					else
						System.out.print(coefficient[i] + "x");
				} else if (i == 0)
					System.out.print(coefficient[i]);
				else {
					if (coefficient[i] == 1)
						System.out.print("x^" + i);
					else
						System.out.print(coefficient[i] + "x^" + i);
				}
			}
			System.out.println();
		}
	}
}
