import java.util.Scanner;

public class d471 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();

			exhaustion(0, n);
		}
		scan.close();
	}

	static StringBuilder sb = new StringBuilder();
	public static void exhaustion(int start, int goal) {

		if (start == goal) {
			System.out.println(sb);
		}

		if (start < goal) {
			sb.append("0");
			exhaustion(start + 1, goal);
			sb.delete(start, goal);

			sb.append("1");
			exhaustion(start + 1, goal);
			sb.delete(start, goal);
		}
	}
}
