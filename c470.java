import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);

		while ((line = br.readLine()) != null) {
			int n = Integer.valueOf(line);
			String dessert = br.readLine();
			String[] dessertArr = dessert.split(" ");
			int desserLen = dessertArr.length;
			int even = 0;
			int odd = 0;
			for (int i = 0; i < desserLen; i += 2) {
				odd += Integer.valueOf(dessertArr[i]);
			}
			for (int j = 1; j < desserLen; j += 2) {
				even += Integer.valueOf(dessertArr[j]);
			}

			pw.println(Math.max(odd, even));
		}
		pw.close();
	}

}