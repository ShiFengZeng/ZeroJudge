import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c547 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		int[] way = new int[10001];
		way[0] = 1;
		way[1] = 1;
		for (int i = 2; i <= 10000; ++i) {
			way[i] = (way[i - 1] + way[i - 2]) % 1000000007;
		}

		while ((line = br.readLine()) != null) {
			int N = Integer.valueOf(line);
			pw.println(way[N]);
		}
		pw.close();
	}

}
