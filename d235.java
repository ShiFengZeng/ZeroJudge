import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class d235 {

	public static void main(String[] args) throws IOException {
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nLine;
		while ((nLine = br.readLine()) != null) {

			if (nLine.equals("0")) {
				break;
			}
			int oddSum = 0;
			int evenSum = 0;
			
			for (int i = nLine.length() - 1; i >= 0; i -= 2) {
				oddSum += nLine.charAt(i) - '0';
			}

			for (int i = nLine.length() - 2; i >= 0; i -= 2) {
				evenSum += nLine.charAt(i) - '0';
			}
			if (Math.abs(oddSum - evenSum) % 11 == 0) {
				System.out.println(String.format("%s is a multiple of 11.", nLine));
			} else {
				System.out.println(String.format("%s is not a multiple of 11.", nLine));
			}

		}
		// scan.close();
	}
}