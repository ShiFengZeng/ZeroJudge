import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class d253 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		int[] cent = new int[] { 1, 5, 10, 25, 50 };
		int[] way = new int[7491];
		way[0] = 1;
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 7490; ++j) {
				if (j >= cent[i]) {
					way[j] += way[j - cent[i]];
				}
			}
		}
		
		while ((line = br.readLine()) != null) {
			int money = Integer.valueOf(line);
			
			pw.println(way[money]);
		}
		pw.close();
	}

}