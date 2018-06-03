import java.util.Scanner;

public class c303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		String str;
		while (scan.hasNext()) {
			StringBuilder sb=new StringBuilder();
			n = scan.nextInt();
			str = scan.next();

			for (int i = 0; i < n; ++i) {
				if (Character.isUpperCase(str.charAt(i))) {
					 sb.append(Character.toLowerCase(str.charAt(i)));
				}else {
					sb.append(Character.toUpperCase(str.charAt(i)));
				}
			}
			System.out.println(sb);
		}
		scan.close();
	}
}