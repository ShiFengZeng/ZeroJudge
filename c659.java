import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] inp = br.readLine().split(" ");
		String con = inp[0];
		int len = inp.length;
		String[] strings = new String[len - 1];
		for (int i = 0; i < len - 1; i++) {
			strings[i] = inp[i + 1];
		}

		pw.println(String.join(" " + con + " ", strings));
		pw.close();
	}
}