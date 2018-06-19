import java.util.Scanner;

public class c636 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			System.out.println(Zodiac(n));
		}
		scan.close();
	}

	public static String Zodiac(int y) {
		String result = "";
		if (y < 0)
			y += 109;

		switch (y % 12) {
		case 1:
			result = "��";
			break;
		case 2:
			result = "��";
			break;
		case 3:
			result = "��";
			break;
		case 4:
			result = "��";
			break;
		case 5:
			result = "�s";
			break;
		case 6:
			result = "�D";
			break;
		case 7:
			result = "��";
			break;
		case 8:
			result = "��";
			break;
		case 9:
			result = "�U";
			break;
		case 10:
			result = "��";
			break;
		case 11:
			result = "��";
			break;
		case 0:
			result = "��";
			break;
		}

		return result;
	}
}