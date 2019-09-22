import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d089 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String line;
		double[][] cost = new double[][] { { 0.1, 0.06, 0.02 }, { 0.25, 0.15, 0.05 }, { 0.53, 0.33, 0.13 },
				{ 0.87, 0.47, 0.17 }, { 1.44, 0.8, 0.3 } };
		int[] cut = new int[] { 0, 480, 1080, 1320, 1440 };

		while ((line = br.readLine()) != null) {
			if (line.equals("#")) {
				break;
			}

			String[] inpTemp = line.split(" ");
			String stop = inpTemp[0];
			int stopNum = stop.charAt(0) - 'A';
			String number = inpTemp[1];
			int h1 = Integer.valueOf(inpTemp[2]);
			int m1 = Integer.valueOf(inpTemp[3]);
			int h2 = Integer.valueOf(inpTemp[4]);
			int m2 = Integer.valueOf(inpTemp[5]);

			int t1 = h1 * 60 + m1;
			int t2 = h2 * 60 + m2;

			int[] used = new int[1440];
			int[] times = new int[4];

			if (t2 <= t1) {
				for (int i = 0; i < t2; ++i)
					used[i] = 1;
				for (int i = t1; i < 1440; ++i)
					used[i] = 1;
			} else {
				for (int i = t1; i < t2; ++i) {
					used[i] = 1;
				}
			}

			for (int i = 0; i < 4; ++i) {
				for (int j = cut[i]; j < cut[i + 1]; ++j) {
					times[i] += used[j];
				}
			}
			times[3] += times[0];
			double totalCost = cost[stopNum][0] * times[1] + cost[stopNum][1] * times[2] + cost[stopNum][2] * times[3];

			pw.println(String.format("%6s%6d%6d%6d%3s%8.2f", number, times[1], times[2], times[3], stop, totalCost));
		}
		pw.close();
	}
}
