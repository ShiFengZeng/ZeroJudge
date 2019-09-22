import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e357 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int input = Integer.valueOf(br.readLine());
		pw.println(F(input));
		pw.close();
	}

	public static int F(int num) {
		if (num == 1) {
			return 1;
		} else if ((num & 1) == 0) {
			return F(num / 2);
		} else {
			return F(num - 1) + F(num + 1);
		}
	}
}
