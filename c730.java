import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c730 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			String[] apples = line.split(" ");
			int[] applesHeight = new int[10];
			for (int i = 0; i < 10; ++i) {
				applesHeight[i] = Integer.valueOf(apples[i]);
			}

			int height = Integer.valueOf(br.readLine()) + 30;

			int count = 0;
			for (int i = 0; i < 10; ++i) {
				if (height >= applesHeight[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}