import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d133 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		long[] way = new long[30001];
		int[] cent = new int[] { 1, 5, 10, 25, 50 };
		way[0] = 1;
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j <= 30000; ++j) {
				if (j >= cent[i])
					way[j] += way[j - cent[i]];
			}
		}
		while ((line = br.readLine()) != null) {
			int money = Integer.valueOf(line);

			if (way[money] > 1)
				pw.println(String.format("There are %d ways to produce %d cents change.", way[money], money));
			else
				pw.println(String.format("There is only %d way to produce %d cents change.", way[money], money));
		}

		pw.close();
	}

}