import java.util.Scanner;

public class d188 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			int N = scan.nextInt();
			for (int i = 0; i < N; ++i) {
				int K = scan.nextInt();
				int a;
				int b = 0;
				int c = 0;

				boolean hasSol = false;

				over: for (a = 0; a <= 225; ++a) {
					for (b = a; b <= 225; ++b) {
						for (c = b; c <= 225; ++c) {
							int abc = a * a + b * b + c * c;
							if (abc > 50000)
								break;
							else if (abc == K) {
								hasSol = true;
								break over;
							}
						}
					}
				}
				if (hasSol) {
					sb.append(a + " " + b + " " + c + "\n");
				} else {
					sb.append(-1 + "\n");
				}				
			}
			System.out.print(sb);
		}
		scan.close();
	}
}