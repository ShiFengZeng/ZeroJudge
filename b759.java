import java.util.Scanner;

public class b759 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		while (scan.hasNext()) {
			StringBuilder sb = new StringBuilder();
			str = scan.next();

			for (int i = 0; i < str.length(); ++i) {				
				sb.append(str, i, str.length());
				sb.append(str, 0, i);	
				sb.append("\n");
			}
			System.out.println(sb);
		}
		scan.close();
	}
}