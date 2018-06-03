import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class a565 {

	public static void main(String[] args) throws IOException {
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		StringBuilder sb = new StringBuilder();
		String nLine;
		String str;
		// while (scan.hasNextInt()) {
		while ((nLine = br.readLine()) != null) {
			// n = scan.nextInt();

			// String str = scan.nextLine();
			n = Integer.parseInt(nLine);
			for (int i = 0; i < n; ++i) {
				int pair = 0;
				int p = 0;

				str = br.readLine();
				int strlen = str.length();
				for (int j = 0; j < strlen; ++j) {
					if (str.charAt(j) == 'p') {
						p++;
					} else if (str.charAt(j) == 'q') {
						if (p > 0) {
							p--;
							pair++;
						}
					}
				}

				// for (int j = 0; j < str.length(); ++j) {
				// char c=str.charAt(j);
				// switch(c) {
				// case 'p':
				// p++;
				// break;
				// case 'q':
				// if(p>0) {
				// p--;
				// pair++;
				// }
				// break;
				// }
				// }
				sb.append(pair + "\n");
			}
			System.out.println(sb);
		}
		// scan.close();
	}
}