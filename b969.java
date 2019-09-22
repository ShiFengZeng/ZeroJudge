import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class b969 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] names = br.readLine().split(" ");
		String greetings = br.readLine();
		for (String name : names) {
			pw.println(greetings + ", " + name);
		}
		pw.close();
	}
}
