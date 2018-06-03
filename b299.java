import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class b299 {

	public static void main(String[] args) throws IOException {
		// Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		// while (scan.hasNext()) {
		while ((line = br.readLine()) != null) {
			// int T = scan.nextInt();
			int T = Integer.valueOf(line);
			for (int i = 0; i < T; ++i) {
				String NMLine = br.readLine();
				String[] NM = NMLine.split("[ ]+");
				int N = Integer.valueOf(NM[0]);
				int M = Integer.valueOf(NM[1]);
				// int N = scan.nextInt();
				// int M = scan.nextInt();
				boolean isPass = true;
				String w_iLine = br.readLine();
				String[] w_i = w_iLine.split("[ ]+");
				for (int j = 0; j < M; ++j) {
					if (N > Integer.valueOf(w_i[j])) {
						isPass = false;
						break;
					}
					// int w_i = scan.nextInt();
					// if (N > w_i) {
					// isPass = false;
					// }
				}
				if (isPass) {
					System.out.println("YEEES!!! INKER!");
				} else {
					System.out.println("NOOOO!!! JACKY XX!");
				}
			}

		}
		// scan.close();
	}
}