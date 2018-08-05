import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Random;

public class c679 {
	public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String LOWER = UPPER.toLowerCase(Locale.ROOT);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int w, v1, v2 = 0;

		Random rm = new Random();
		line = br.readLine();
		
		String[] input = line.split(" ");
		w = Integer.valueOf(input[0]);
		v1 = Integer.valueOf(input[1]);
		v2 = Integer.valueOf(input[2]);
		int times = v1 - 1;

		for (int i = 0; i < w; ++i) {
			String s = "";
			s += UPPER.charAt(rm.nextInt(25));
			for (int j = 0; j < times; ++j) {
				s += LOWER.charAt(rm.nextInt(25));
			}
			times++;
			if(times>=v2)
				times--;
			
			System.out.println(String.format("%s: hello, %s", s, s));
		}
	}

}