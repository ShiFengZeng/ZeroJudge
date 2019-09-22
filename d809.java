import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			int N = Integer.valueOf(line);
			int[][] _xy = new int[N][2];
			for (int i = 0; i < N; ++i) {
				String[] temp = br.readLine().split(" ");
				_xy[i][0] = Integer.valueOf(temp[0]);
				_xy[i][1] = Integer.valueOf(temp[1]);
			}

			int max_area = 0;
			for (int i = 0; i < N - 2; ++i) {
				for (int j = 1; j < N - 1; ++j) {
					for (int k = 2; k < N; ++k) {
						max_area = Math.max(max_area,
								area(_xy[i][0], _xy[i][1], _xy[j][0], _xy[j][1], _xy[k][0], _xy[k][1]));
					}
				}
			}

			System.out.println(String.format("%.2f", max_area * 0.5));
		}
	}

	static int area(int a, int b, int c, int d, int e, int f) {
		return Math.abs(a * d + c * f + b * e - b * c - d * e - a * f);
	}
}
