import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class b229 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		BigInteger[] up = new BigInteger[51];
		BigInteger[] left = new BigInteger[51];
		BigInteger[] right = new BigInteger[51];
		BigInteger big1 = BigInteger.ONE;

		up[1] = big1;
		left[1] = big1;
		right[1] = big1;
		for (int i = 2; i <= 50; ++i) {
			up[i] = up[i - 1].add(left[i - 1]).add(right[i - 1]);
			left[i] = up[i - 1].add(left[i - 1]);
			right[i] = up[i - 1].add(right[i - 1]);
		}
		
		String line;
		while ((line=br.readLine())!=null) {
			int n = Integer.valueOf(line);
			pw.println(up[n].add(left[n]).add(right[n]));
		}		
		pw.close();
	}

}