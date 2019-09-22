import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c833 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		String[] NM = br.readLine().split(" ");
		int N = Integer.valueOf(NM[0]);
		int M = Integer.valueOf(NM[1]);
		boolean[] x = new boolean[N];
		boolean[] y = new boolean[M];

		for (int i = 0; i < N; ++i) {
			String a = br.readLine();
			for (int j = 0; j < M; ++j) {
				if (a.charAt(j) == '#') {
					x[i] = true;
					y[j] = true;
				}
			}
		}

		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < M; ++j) {
				if (x[i] || y[j]) {
					pw.print("#");
				} else {
					pw.print("X");
				}
			}
			pw.println();
		}
		pw.close();
	}
}
