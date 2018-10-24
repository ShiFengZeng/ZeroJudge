import java.util.Scanner;

public class d256 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; ++i) {
			int G = scan.nextInt();
			int L = scan.nextInt();
			if (L % G == 0)
				System.out.println(G + " " + L);
			else
				System.out.println(-1);
		}
		scan.close();
	}
}