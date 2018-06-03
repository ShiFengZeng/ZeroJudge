import java.util.Scanner;

public class b187 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		int decimal = 0;
		System.out.println("十六進位表示法  相對應的十進位表示法");
		while (scan.hasNext()) {
			s = scan.nextLine();
			decimal = Integer.parseInt(s, 16);

			System.out.println(String.format("      %s                 %d", s, decimal));
		}
		scan.close();
	}
}