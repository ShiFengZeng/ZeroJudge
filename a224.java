import java.util.Scanner;

public class a224 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputStr;
		
		while (scan.hasNext()) {
			inputStr = scan.nextLine();
			inputStr = inputStr.toLowerCase();
			
			int[] letterCount = new int[26];			
			for (int i = 0; i < inputStr.length(); ++i) {
				if (inputStr.charAt(i) >= 'a' && inputStr.charAt(i) <= 'z') {
					letterCount[inputStr.charAt(i) - 'a']++;
				}
			}
			int oddCount = 0;
			for (int i = 0; i < letterCount.length; ++i) {
				if (letterCount[i] % 2 != 0) {
					oddCount++;
				}
			}
			System.out.println(oddCount > 1 ? "no..." : "yes !");
		}
		scan.close();
	}
}
