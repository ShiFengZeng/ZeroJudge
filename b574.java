import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
//import java.util.Scanner;

public class b574 {
	public static void main(String[] args) throws IOException {
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		String line;
		while ((line = br.readLine()) != null) {
			int K = Integer.valueOf(line);
			int max = 0;

			for (int i = 0; i < K; ++i) {
				String XC = br.readLine();
				String[] XCArr = XC.split(" ");
				int X = Integer.valueOf(XCArr[0]);
				int C = Integer.valueOf(XCArr[1]);

				if (C == 1) {
					hs.add(X);
					max = Math.max(max, hs.size());
				} else {
					hs.remove(X);
				}
			}
			System.out.println(max);
		}
		// scan.close();
	}
}
