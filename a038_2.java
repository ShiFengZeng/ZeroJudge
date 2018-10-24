import java.util.Scanner;

public class a038_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String s = new StringBuffer(scan.next()).reverse().toString();
			System.out.println(Integer.valueOf(s));
		}
		scan.close();
	}
}