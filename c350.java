import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c350 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		PrintWriter pw = new PrintWriter(System.out);
		while ((line = br.readLine()) != null) {
			String[] NKW = line.split(" ");
			int N = Integer.valueOf(NKW[0]);
			int K = Integer.valueOf(NKW[1]);
			int W = Integer.valueOf(NKW[2]);

			int num = 0;
			int result = N;
			while (N >= K) {
				num = N / K * W;
				result += num;
				N = num + N % K;
			}
			pw.println(result);
		}
		pw.close();
	}

}
