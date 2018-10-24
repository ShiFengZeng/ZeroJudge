import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d111_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);

			if (n == 0) {
				break;
			}
			if (isExactSquareNumber(n) == true) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}		
	}

	public static boolean isExactSquareNumber(int num) {
		double doubleNum = Math.sqrt(num);

		if (doubleNum % 1 == 0) {
			return true;
		} else {
			return false;
		}
	}
}