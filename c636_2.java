import java.util.Scanner;

public class c636_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y;
		String[] Zodiac = { "��", "��", "��", "��", "��", "�s", "�D", "��", "��", "�U", "��", "��" };
		while (scan.hasNext()) {
			y = scan.nextInt();
			if (y < 0)
				y += 109;
			System.out.println(Zodiac[y % 12]);
		}
		scan.close();
	}
}