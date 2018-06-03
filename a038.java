import java.util.Scanner;

public class a038 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			String str = scan.nextLine();

			StringBuffer sb = new StringBuffer(str);
			String s = sb.reverse().toString();
			int a = Integer.parseInt(s);
			// int a = Integer.parseInt(str);

//			if (a == 0) {
//				System.out.println("0");
//			}
//			while (a % 10 == 0) {
//				a /= 10;
//			}
			System.out.println(a);

			// System.out.println(a);
			// str = String.valueOf(a);
			//
			// for (int i = str.length() - 1; a > 0 && i >= 0; --i) {
			// System.out.print(str.charAt(i));
			// }
			System.out.println();
		}
	}
}
