import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c430 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		if (!line.equals("1")) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
