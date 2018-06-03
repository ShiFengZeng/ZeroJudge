import java.util.Scanner;

public class d188_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (scan.hasNext()) {
			int N = scan.nextInt();
			for (int i = 0; i < N; ++i) {
				int K = scan.nextInt();
				int a;
				int b = 0;

				int intSol = 0;
				double doubleSol = 0;

				boolean hasSol = false;

				for (a = 0; a * a <= K; ++a) {
					for (b = a; a * a + b * b <= K; ++b) {
						intSol = (int) Math.sqrt(K - (a * a + b * b));
						doubleSol = Math.sqrt(K - (a * a + b * b));
						if (intSol == doubleSol) {
							hasSol = true;
							break;
						}
					}
					if (hasSol)
						break;
				}
				
				if (hasSol) {
					sb.append(a + " " + b + " " + intSol + "\n");
				} else {
					sb.append(-1 + "\n");
				}
			}
			System.out.print(sb);
		}
		scan.close();
	}
}