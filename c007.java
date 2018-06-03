import java.util.Scanner;

public class c007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		
		boolean isLeftQuote = true;
		while (scan.hasNext()) {
			str = scan.nextLine();
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < str.length(); ++i) {
				if (str.charAt(i) == '\"') {					
					if (isLeftQuote) {
						sb.append("``");
						isLeftQuote = false;
					} else {
						sb.append("''");
						isLeftQuote = true;
					}
				} else {
					sb.append(str.charAt(i));
				}
			}
			System.out.println(sb);
		}
		scan.close();
	}
}