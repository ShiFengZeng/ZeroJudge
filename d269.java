import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class d269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int N = Integer.valueOf(line);
			for (int i = 0; i < N; ++i) {
				String[] inpTemp = br.readLine().split(" ");
				int n = Integer.valueOf(inpTemp[0]);
				double[] A = new double[n];

				for (int j = 0; j < n; ++j) {
					A[j] = Double.valueOf(inpTemp[j + 1]);
				}

				Arrays.sort(A);

				double max = 0;
				for (int j = 0; j < n - 2; ++j) {
					max = Math.max(max, area(A[j], A[j + 1], A[j + 2]));
				}
				pw.println(String.format("%.2f", max));
			}
		}
		pw.close();
	}

	static double area(double a, double b, double c) {
		double s = (a + b + c) / 2;
		if (s - a <= 0 || s - b <= 0 || s - c <= 0)
			return 0;
		else
			return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}
