import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c470_2 {
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
			for (int i = 0; i < desserLen; i++) {
				if (i % 2 != 0)
					odd += Integer.valueOf(dessertArr[i]);
				else
					even += Integer.valueOf(dessertArr[i]);
			}

			pw.println(Math.max(odd, even));
		}
		pw.close();
	}

}