import java.util.Scanner;

public class c638 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			n = scan.nextInt();
			sb.append(getFist(n) + getLast(n) + "\n");
		}
		System.out.print(sb);
		scan.close();
	}

	public static String getFist(int n) {
		String result = "";
		switch (n % 10) {
		case 4:
			result = "¥Ò";
			break;
		case 5:
			result = "¤A";
			break;
		case 6:
			result = "¤þ";
			break;
		case 7:
			result = "¤B";
			break;
		case 8:
			result = "¥³";
			break;
		case 9:
			result = "¤v";
			break;
		case 0:
			result = "©°";
			break;
		case 1:
			result = "¨¯";
			break;
		case 2:
			result = "¤Ð";
			break;
		case 3:
			result = "¬Ñ";
			break;
		}
		return result;
	}

	public static String getLast(int n) {
		String result = "";
		switch (n % 12) {
		case 4:
			result = "¤l";
			break;
		case 5:
			result = "¤¡";
			break;
		case 6:
			result = "±G";
			break;
		case 7:
			result = "¥f";
			break;
		case 8:
			result = "¨°";
			break;
		case 9:
			result = "¤x";
			break;
		case 10:
			result = "¤È";
			break;
		case 11:
			result = "¥¼";
			break;
		case 0:
			result = "¥Ó";
			break;
		case 1:
			result = "¨»";
			break;
		case 2:
			result = "¦¦";
			break;
		case 3:
			result = "¥è";
			break;
		}
		return result;
	}
}