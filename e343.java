import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class e343 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int w = Integer.valueOf(br.readLine());
		int h = Integer.valueOf(br.readLine());
		pw.println(String.format("%.1f", bmi(w, h / 100.0)));
		pw.close();
	}

	public static double bmi(double w, double h) {
		return w / (h * h);
	}
}
