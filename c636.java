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
			result = "¹«";
			break;
		case 2:
			result = "¤û";
			break;
		case 3:
			result = "ªê";
			break;
		case 4:
			result = "¨ß";
			break;
		case 5:
			result = "Às";
			break;
		case 6:
			result = "³D";
			break;
		case 7:
			result = "°¨";
			break;
		case 8:
			result = "¦Ï";
			break;
		case 9:
			result = "µU";
			break;
		case 10:
			result = "Âû";
			break;
		case 11:
			result = "ª¯";
			break;
		case 0:
			result = "½Þ";
			break;
		}

		return result;
	}
}