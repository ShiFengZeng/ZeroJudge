import java.util.Scanner;

public class d562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;

		while (scan.hasNext()) {
			n = scan.nextInt();
			int[] centipede = new int[n];
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < n; ++i) {
				centipede[i] = scan.nextInt();
			}
			for (int i = 0; i < n; ++i) {
				sb.append((centipede[i] + " "));
			}
			sb.append("\n");

			while (centipede.length > 0) {
				centipede = reverse(delete(centipede));
				for (int i : centipede) {
					sb.append(i + " ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
		}
		scan.close();
	}

	public static int[] reverse(int[] n) {
		int[] result = new int[n.length];

		for (int i = 0; i < n.length; ++i) {
			result[i] = n[n.length - i - 1];
		}

		return result;
	}

	public static int[] delete(int[] n) {
		int[] result = new int[n.length - 1];

		for (int i = 0; i < n.length - 1; ++i) {
			result[i] = n[i + 1];
		}

		return result;
	}
}