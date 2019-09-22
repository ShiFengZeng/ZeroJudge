import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class c929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String sp = br.readLine();
		String[] stus = br.readLine().split(sp);
		for (String s : stus) {
			pw.println(s);
		}
		pw.close();
	}
}
