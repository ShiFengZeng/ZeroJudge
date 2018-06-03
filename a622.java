import java.util.Scanner;

public class a622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String str;
			char[][] name = new char[16][1000];
			int i = 0;
			int maxLength = 0;
			while ((str = scan.nextLine()) != null) {

				if (maxLength < str.length()) {
					maxLength = str.length();
				}

				if (!str.equals("END")) {
					for (int j = 0; j < str.length(); ++j) {
						name[i][j] = str.charAt(j);
					}
					i++;
				}

				else {
					for (int k = 0; k < maxLength; k++) {
						for (int j = 0; j < i; ++j) {

//							if (k >= name[j].length)
//								System.out.printf("   ");
//							else
//								System.out.printf("%c  ", name[j][k]);
							 System.out.print(String.format("%-3s", name[j][k]));
						}
						System.out.println();
					}
					break;
				}
			}
		}
		scan.close();
	}
}