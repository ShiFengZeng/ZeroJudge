import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e315 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] inpArr = br.readLine().split(" ");
		int[] abc = new int[3];
		for (int i = 0; i < inpArr.length; i++) {
			abc[i] = Integer.valueOf(inpArr[i]);
		}
		pw.println((int)(abc[0] * 0.2 + abc[1] * 0.3 + abc[2] * 0.5));
		pw.close();
	}
}
