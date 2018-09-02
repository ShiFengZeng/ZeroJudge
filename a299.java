import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class a299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		int result = -1;
		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			int[][] carpet = new int[n][4];
			for (int i = 0; i < n; ++i) {
				String[] carpetArr = br.readLine().split(" ");
				carpet[i][0] = Integer.valueOf(carpetArr[0]);
				carpet[i][1] = Integer.valueOf(carpetArr[1]);
				carpet[i][2] = Integer.valueOf(carpetArr[2]);
				carpet[i][3] = Integer.valueOf(carpetArr[3]);
			}
			int x, y;
			String[] temp = br.readLine().split(" ");
			x = Integer.valueOf(temp[0]);
			y = Integer.valueOf(temp[1]);
			for (int i = n - 1; i >= 0; --i) {
				if (carpet[i][0] <= x && carpet[i][0] + carpet[i][2] >= x) {
					if (carpet[i][1] <= y && carpet[i][1] + carpet[i][3] >= y) {
						result = i + 1;
						break;
					}
				}
			}
			pw.println(result);
		}
		pw.close();
	}

}